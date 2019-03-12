package com.qfcwx.springbootecxeptions.pojo;

/**
 * @ClassName: ExceptionHandler
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/12 14:31
 * @Version 1.0
 **/
public class CustomerException extends RuntimeException {

    private String code;
    private String msg;

    public CustomerException(String code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
