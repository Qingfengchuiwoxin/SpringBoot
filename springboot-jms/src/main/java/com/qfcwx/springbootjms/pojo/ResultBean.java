package com.qfcwx.springbootjms.pojo;

/**
 * @ClassName: ResultBean
 * @Author: 清风一阵吹我心
 * @Description: TODO
 * @Date: 2019/3/30 15:22
 * @Version 1.0
 **/
public class ResultBean {

    private String msg;
    private Object data;
    private Integer code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public static ResultBean success(String msg) {
        return success(msg, null);
    }

    public static ResultBean success(String msg, Object data) {
        ResultBean bean = new ResultBean();
        bean.setMsg(msg);
        bean.setData(data);
        bean.setCode(200);
        return bean;
    }

    public static ResultBean fail() {
        return fail("处理失败", 100);
    }

    public static ResultBean fail(String msg) {
        return fail(msg, 100);
    }

    public static ResultBean fail(String msg, Integer code) {
        ResultBean bean = new ResultBean();
        bean.setCode(code);
        bean.setMsg(msg);
        return bean;
    }

}
