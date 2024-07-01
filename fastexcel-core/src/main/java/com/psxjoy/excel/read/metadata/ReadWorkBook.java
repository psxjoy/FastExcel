package com.psxjoy.excel.read.metadata;


import com.psxjoy.excel.support.ExcelTypeEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.InputStream;
import java.nio.charset.Charset;

@Getter
@Setter
@EqualsAndHashCode
public class ReadWorkBook extends ReadBasicParameter {
    /**
     * 文件类型
     */
    private ExcelTypeEnum excelTypeEnum;
    /**
     * 文件流
     * 如何 文件流和 file同时存在，优先使用File
     */
    private InputStream inputStream;
    /**
     * 文件
     */
    private File file;
    /**
     * 编码类型，只对csv文件有效
     */
    private Charset charset;

    /**
     * 密码
     */
    private String password;

}
