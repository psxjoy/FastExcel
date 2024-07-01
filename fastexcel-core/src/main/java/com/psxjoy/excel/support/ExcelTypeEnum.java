package com.psxjoy.excel.support;


import com.psxjoy.excel.exception.ExcelAnalysisException;
import com.psxjoy.excel.exception.ExcelCommonException;
import com.psxjoy.excel.read.metadata.ReadWorkBook;
import com.psxjoy.excel.util.StringUtils;
import lombok.Getter;
import org.apache.poi.util.IOUtils;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Getter
public enum ExcelTypeEnum {

    /**
     * csv
     */
    CSV(".csv", new byte[] {-27, -89, -109, -27}),

    /**
     * xls
     */
    XLS(".xls", new byte[] {-48, -49, 17, -32, -95, -79, 26, -31}),

    /**
     * xlsx
     */
    XLSX(".xlsx", new byte[] {80, 75, 3, 4});

    final String value;
    final byte[] magic;

    ExcelTypeEnum(String value, byte[] magic) {
        this.value = value;
        this.magic = magic;
    }

    final static int MAX_PATTERN_LENGTH = 8;

    public static ExcelTypeEnum valueOf(ReadWorkBook readWorkBook) {
        ExcelTypeEnum excelType = readWorkBook.getExcelTypeEnum();
        if (excelType != null) {
            return excelType;
        }
        File file = readWorkBook.getFile();
        InputStream inputStream = readWorkBook.getInputStream();
        if (file == null && inputStream == null) {
            throw new ExcelAnalysisException("File and inputStream must be a non-null");
        }
        try {
            if (file != null) {
                if (!file.exists()) {
                    throw new ExcelAnalysisException("File  " + file.getAbsolutePath() + " not exists.");
                }
                String fileName = file.getName();
                if (fileName.endsWith(XLSX.getValue())) {
                    return XLSX;
                } else if (fileName.endsWith(XLS.getValue())) {
                    return XLS;
                } else if (fileName.endsWith(CSV.getValue())) {
                    return CSV;
                }
                try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file))) {
                    return recognitionExcelType(bufferedInputStream);
                }
            }
            if (!inputStream.markSupported()) {
                inputStream = new BufferedInputStream(inputStream);
                readWorkBook.setInputStream(inputStream);
            }
            return recognitionExcelType(inputStream);
        } catch (Exception e) {
            throw new ExcelCommonException(
                    "Convert excel format exception.You can try specifying the 'excelType' yourself", e);
        }
    }


    private static ExcelTypeEnum recognitionExcelType(InputStream inputStream) throws Exception {
        byte[] data = IOUtils.peekFirstNBytes(inputStream, MAX_PATTERN_LENGTH);
        if (findMagic(XLSX.magic, data)) {
            return XLSX;
        } else if (findMagic(XLS.magic, data)) {
            return XLS;
        }
        return CSV;
    }


    private static boolean findMagic(byte[] excepted, byte[] actual) {
        int i = 0;
        for (byte exceptedByte : excepted) {
            if (actual[i++] != exceptedByte && exceptedByte != '?') {
                return false;
            }
        }
        return true;
    }
}
