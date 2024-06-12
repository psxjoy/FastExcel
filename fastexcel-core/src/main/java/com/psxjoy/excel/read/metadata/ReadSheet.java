package com.psxjoy.excel.read.metadata;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class ReadSheet extends ReadBasicParameter {

    private Integer sheetNo;

    private String sheetName;

    public ReadSheet(){}


}
