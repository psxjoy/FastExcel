package com.psxjoy.excel;

import com.psxjoy.excel.read.builder.ExcelReaderBuilder;
import com.psxjoy.excel.read.listener.ReadListener;

import java.io.File;
import java.io.InputStream;

public class FastExcelFactory {


    public static ExcelReaderBuilder read() {
        return new ExcelReaderBuilder();
    }

    public static ExcelReaderBuilder read(File file) {
        return read(file, null, null);
    }

    public static ExcelReaderBuilder read(File file, ReadListener readListener) {
        return read(file, null, readListener);
    }

    public static ExcelReaderBuilder read(File file, Class head, ReadListener readListener) {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        return excelReaderBuilder;
    }


    public static ExcelReaderBuilder read(String pathName) {
        return read(pathName, null, null);
    }

    public static ExcelReaderBuilder read(String pathName, ReadListener readListener) {
        return read(pathName, null, readListener);
    }

    public static ExcelReaderBuilder read(String pathName, Class head, ReadListener readListener) {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        return excelReaderBuilder;
    }


    public static ExcelReaderBuilder read(InputStream inputStream) {
        return read(inputStream, null, null);
    }

    public static ExcelReaderBuilder read(InputStream inputStream, ReadListener readListener) {
        return read(inputStream, null, readListener);
    }

    public static ExcelReaderBuilder read(InputStream inputStream, Class head, ReadListener readListener) {
        ExcelReaderBuilder excelReaderBuilder = new ExcelReaderBuilder();
        return excelReaderBuilder;
    }


}
