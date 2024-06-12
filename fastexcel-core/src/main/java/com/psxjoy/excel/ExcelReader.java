package com.psxjoy.excel;

import com.psxjoy.excel.analysis.ExcelAnalyser;
import com.psxjoy.excel.analysis.ExcelAnalyserImpl;
import com.psxjoy.excel.read.metadata.ReadWorkBook;

import java.io.Closeable;
import java.io.IOException;

public class ExcelReader implements Closeable {

    private final ExcelAnalyser excelAnalyser;


    public ExcelReader(ReadWorkBook readWorkBook) {
        excelAnalyser = new ExcelAnalyserImpl(readWorkBook);
    }

    @Override
    public void close() throws IOException {

    }
}
