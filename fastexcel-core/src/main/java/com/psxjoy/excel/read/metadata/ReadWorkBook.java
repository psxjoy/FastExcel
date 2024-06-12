package com.psxjoy.excel.read.metadata;


import com.psxjoy.excel.support.ExcelTypeEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.InputStream;

@Getter
@Setter
@EqualsAndHashCode
public class ReadWorkBook extends ReadBasicParameter {

    private ExcelTypeEnum excelTypeEnum;


    private InputStream inputStream;

    private String password;

    private File file;
}
