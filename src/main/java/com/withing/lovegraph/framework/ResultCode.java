package com.withing.lovegraph.framework;

public class ResultCode {
    public static final ResultCode SUCCESS = new ResultCode(200, "Success");
    public static final ResultCode FAIL = new ResultCode(201, "Fail");
    public static final ResultCode PARAM_EMPTY = new ResultCode(202, "Param is empty");
    public static final ResultCode NO_LOGIN = new ResultCode(203, "Not Login");
    public static final ResultCode PAY_PASSWORD_ERROR = new ResultCode(205, "Pay password error");
    private Integer code;
    private String message;

    public ResultCode ( ) {
    }

    public ResultCode (Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode ( ) {
        return code;
    }

    public void setCode (Integer code) {
        this.code = code;
    }

    public String getMessage ( ) {
        return message;
    }

    public void setMessage (String message) {
        this.message = message;
    }
}
