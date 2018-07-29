package com.itao.common.result;

import java.io.Serializable;

public class ActionResult<T> implements Serializable {

    private static final long serialVersionUID = 7671720391359004605L;

    private boolean result;

    private String errorCode;

    private String errorMsg;

    private T data;

    private Integer count;

    public ActionResult() {
    }

    public ActionResult(boolean result, String errorMsg) {
        this.result = result;
        this.errorMsg = errorMsg;
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}
