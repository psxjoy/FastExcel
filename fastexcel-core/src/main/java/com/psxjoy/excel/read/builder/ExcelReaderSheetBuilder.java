package com.psxjoy.excel.read.builder;

import com.psxjoy.excel.ExcelReader;
import com.psxjoy.excel.read.metadata.ReadSheet;

public class ExcelReaderSheetBuilder extends AbstractExcelReaderParameterBuilder<ExcelReaderSheetBuilder, ReadSheet> {

    private ExcelReader excelReader;

    private final ReadSheet readSheet;


    public ExcelReaderSheetBuilder() {
        this.readSheet = new ReadSheet();
    }

    public ExcelReaderSheetBuilder(ExcelReader excelReader) {
        this.readSheet = new ReadSheet();
        this.excelReader = excelReader;
    }


    public ExcelReaderSheetBuilder sheetNo(Integer sheetNo) {
        readSheet.setSheetNo(sheetNo);
        return this;
    }
    public ExcelReaderSheetBuilder sheetName(String sheetName) {
        readSheet.setSheetName(sheetName);
        return this;
    }

    @Override
    protected ReadSheet parameter() {
        return readSheet;
    }
}
