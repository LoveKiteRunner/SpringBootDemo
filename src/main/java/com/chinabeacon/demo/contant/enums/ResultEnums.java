package com.chinabeacon.demo.contant.enums;

/**
 * @author lixiao
 * @date 2019/8/5 17:16
 */
public enum ResultEnums {

    // 系统错误状态码
    SYSTEM_ERROR(1, "系统异常"),
    // Redis ERROR
    REDIS_CONNECTION_FAILURE(2, "redis操作失败，请检查链接"),
    // 手机号不能为空
    PHONE_NOT_NULL(100, "手机号不能为空"),
    // 手机号已存在
    PHONE_ALREADY_EXIST(101, "手机号已存在"),
    // 该用户不存在
    USER_NOT_EXIST(102, "用户不存在"),
    // 验证码不能为空
    CODE_NOT_NULL(103, "验证码不能为空"),
    // 验证码已失效
    CODE_EXPIRE(104, "验证码已失效"),
    // 验证码不正确
    CODE_ERROR(105, "验证码不正确"),
    // 不支持该登录方式
    NOT_SUPPORTED_LOGIN_MODE(106, "不支持该登录方式"),
    // 用户名不存在
    USERNAME_NOT_EXIST(107, "用户名不存在"),
    // 密码不正确
    PASSWORD_ERROR(108, "密码不正确"),
    // 没有相关权限
    NOT_AUTH(110, "没有相关权限"),
    // token无效
    TOKEN_INVALID(112, "token无效或已过期"),
    // 发送短信失败
    SEND_SMS_ERROR(115, "发送失败"),
    // 缺少相应参数
    MISSING_PARAMETER(121, "参数绑定失败:缺少参数或参数类型不正确")
    ;


    private Integer code;
    private String msg;

    ResultEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "ResultEnums{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                '}';
    }}
