package com.yanfu.model.base;

/**
 * @Authour Zhang Yanfu
 * @Date 2018/7/25.
 * @Email 1105564280@qq.com
 * @WeChat zyfJava
 */
public class BaseResult<T>  extends BaseModel{
    private String code = "0";
    private String message = "success";
    private T data;


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResult(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResult() {
    }
}
