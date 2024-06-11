package com.psxjoy.excel.read.metadata;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.io.InputStream;

@Getter
@Setter
@EqualsAndHashCode
public class ReadWorkBook extends ReadBasicParameter {

    private InputStream inputStream;

    private File file;
}
