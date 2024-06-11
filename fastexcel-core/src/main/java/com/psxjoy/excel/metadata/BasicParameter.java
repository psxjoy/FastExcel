package com.psxjoy.excel.metadata;


import com.psxjoy.excel.enums.CacheLocationEnum;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Locale;

@Getter
@Setter
@EqualsAndHashCode
public class BasicParameter {

    private List<List<String>> head;

    private Class<?> clazz;


    private Boolean autoTrim;

    private Boolean use1904windowing;

    private Locale locale;

    private Boolean useScientificFormat;

    private CacheLocationEnum fileCacheLocation;
}
