package com.wei.chong.root.weichongcommon.bean;

/**
 * @author wc
 * @date 2020/5/9 17:44
 */
public class ApiResult<T> {
    public static final ApiResult SUCCESS = new ApiResult(0, "成功");
    public static final ApiResult FAIL = new ApiResult(1, "失败");
    public static final ApiResult PARAMS_ERROR = new ApiResult(2, "参数错误");
    public static final ApiResult AUTHFAILD = new ApiResult(401, "认证失败");
    public static final ApiResult LOGINFAILD = new ApiResult(402, "账号/密码错误");
    public static final ApiResult PERMISSION_DENIED = new ApiResult(403, "权限不足");
    private int code;
    private String msg;
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ApiResult() {
    }

    public ApiResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ApiResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
