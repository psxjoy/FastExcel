package com.psxjoy.excel.read.builder;

import com.psxjoy.excel.ExcelReader;
import com.psxjoy.excel.read.metadata.ReadBasicParameter;
import com.psxjoy.excel.read.metadata.ReadWorkBook;

import java.io.File;
import java.io.InputStream;

public class ExcelReaderBuilder extends AbstractExcelReaderParameterBuilder<ExcelReaderBuilder, ReadBasicParameter> {

    private final ReadWorkBook readWorkBook;

    public ExcelReaderBuilder() {
        this.readWorkBook = new ReadWorkBook();
    }


    public ExcelReaderBuilder file(File file) {
        readWorkBook.setFile(file);
        return this;
    }

    public ExcelReader build() {
        return new ExcelReader(readWorkBook);
    }




    public ExcelReaderBuilder file(String pathName) {
        return file(new File(pathName));
    }

    public ExcelReaderBuilder file(InputStream inputStream) {
        readWorkBook.setInputStream(inputStream);
        return this;
    }

    public ExcelReaderSheetBuilder sheet(Integer sheetNo,String sheetName) {
        ExcelReaderSheetBuilder excelReaderSheetBuilder = new ExcelReaderSheetBuilder();
    }


    @Override
    protected ReadBasicParameter parameter() {
        return readWorkBook;
    }
}
