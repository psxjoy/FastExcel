package com.psxjoy.excel.metadata;

public abstract class AbstractParameterBuilder<T extends AbstractParameterBuilder, C extends BasicParameter> {


    public T head(Class<?> clazz) {
        parameter().setClazz(clazz);
        return self();
    }


    public T self() {
        return (T) this;
    }

    protected abstract C parameter();
}
