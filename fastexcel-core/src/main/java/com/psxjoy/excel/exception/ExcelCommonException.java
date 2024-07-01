package com.psxjoy.excel.exception;

public class ExcelCommonException extends ExcelRuntimeException{
    public ExcelCommonException() {}

    public ExcelCommonException(String message) {
        super(message);
    }

    public ExcelCommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public ExcelCommonException(Throwable cause) {
        super(cause);
    }
}
