package com.withing.lovegraph.framework;

public class ResultResponse<T> extends ResultCode {
    T data;

    public ResultResponse () {
        this(ResultCode.SUCCESS);
    }

    public ResultResponse (ResultCode resultCode,T data){
        this.setResultCode(resultCode);
        this.setData(data);
    }
    public ResultResponse(T data){
        this(ResultCode.SUCCESS,data);
    }

    public ResultResponse(ResultCode resultCode){
        this(resultCode, (T) null);
    }

    public T getData ( ) {
        return data;
    }

    public ResultResponse setData (T data) {
        this.data = data;
        return this;
    }

    public ResultResponse setResultCode(ResultCode resultCode){
        this.setCode(resultCode.getCode());
        this.setMessage(resultCode.getMessage());
        return this;
    }
}
