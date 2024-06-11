package com.psxjoy.excel.read.builder;

import com.psxjoy.excel.read.metadata.ReadWorkBook;

import java.io.File;
import java.io.InputStream;

public class ExcelReaderBuilder {

    private final ReadWorkBook readWorkBook;

    public ExcelReaderBuilder() {
        this.readWorkBook = new ReadWorkBook();
    }


    public ExcelReaderBuilder file(File file) {
        readWorkBook.setFile(file);
        return this;
    }

    public ExcelReaderBuilder file(String pathName) {
        return file(new File(pathName));
    }

    public ExcelReaderBuilder file(InputStream inputStream) {
        readWorkBook.setInputStream(inputStream);
        return this;
    }
}
