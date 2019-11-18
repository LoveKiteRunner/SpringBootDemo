package com.chinabeacon.demo.mbg.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;


@ApiModel(description = "登錄對象")
public class LoginModel {
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getValidCode() {
        return ValidCode;
    }

    public void setValidCode(String validCode) {
        ValidCode = validCode;
    }

    @ApiModelProperty(value="用戶名",required=true)
    private  String userName;
    @ApiModelProperty(value="密碼",required=true)
    private  String Password;
    @ApiModelProperty(value="驗證碼",required=true)
    private  String ValidCode;
}
