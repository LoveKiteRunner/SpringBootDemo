package com.chinabeacon.demo.contant.enums;

/**
 * @author knight
 */
public enum RoleEnums {
    /**
     * 乘客角色
     */
    USER(1L, "user", "乘客角色"),
    /**
     * 司机角色
     */
    DRIVER(2L, "driver", "司机角色"),
    /**
     * 管理员角色
     */
    ADMIN(3L, "admin", "管理员角色"),
    /**
     * 游客角色
     */
    GUEST(4L, "guest", "游客角色");

    private long code;

    private String name;

    private String msg;

    RoleEnums(long code, String name, String msg) {
        this.code = code;
        this.name = name;
        this.msg = msg;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "RoleEnums{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                '}';
    }
}
