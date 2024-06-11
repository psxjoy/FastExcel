package com.psxjoy.excel.read.builder;

import com.psxjoy.excel.metadata.AbstractParameterBuilder;
import com.psxjoy.excel.read.listener.ReadListener;
import com.psxjoy.excel.read.metadata.ReadBasicParameter;
import com.psxjoy.excel.util.ListUtils;

public abstract class AbstractExcelReaderParameterBuilder<T extends AbstractExcelReaderParameterBuilder,
        C extends ReadBasicParameter> extends AbstractParameterBuilder<T, C> {


    public T registerReadListener(ReadListener<?> readListener) {
        if (parameter().getCustomReadListener() == null) {
            parameter().setCustomReadListener(ListUtils.newArrayList());
        }
        parameter().getCustomReadListener().add(readListener);
        return self();
    }
}
