package com.chinabeacon.demo.controller;

import com.chinabeacon.demo.contant.enums.LoginType;
import com.chinabeacon.demo.contant.enums.ResultEnums;
import com.chinabeacon.demo.mbg.dto.LoginModel;
import com.chinabeacon.demo.mbg.model.Student;
import com.chinabeacon.demo.mbg.model.Sysuser;
import com.chinabeacon.demo.service.SysuserService;
import com.chinabeacon.demo.util.api.CommonResult;
import com.chinabeacon.demo.util.shiro.JwtUtil;
import com.chinabeacon.demo.util.shiro.token.CustomizedToken;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 描述
 */
@Api(tags = "LoginController", description = "登录")
@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private SysuserService sysuserService;

    @ApiOperation("登录")
    @PostMapping("login")
    public CommonResult<String> login(@RequestBody LoginModel loginModel) throws Exception {
        // 封装用户数据
        CustomizedToken token;
        try {
            Sysuser sysUser = sysuserService.findByUserName(loginModel.getUserName());
            if (sysUser == null) {
                return CommonResult.failed("用戶名不存在");
            }
            // 获取Subject
            Subject subject = SecurityUtils.getSubject();
            // 密码登录
            token = new CustomizedToken(loginModel.getUserName(), loginModel.getPassword(), LoginType.PASSWORD_LOGIN_TYPE.toString());
            // 4.执行登录方法
            subject.login(token);
            // 生成jwtToken
            String jwtToken = JwtUtil.sign(sysUser.getId(), sysUser.getId(), sysUser.getPassword());
            // token
            return CommonResult.success(jwtToken);
        } catch (UnknownAccountException e) {
            return CommonResult.failed("用戶名不存在");
        } catch (LockedAccountException e) {
            return CommonResult.failed("帐号已被锁定，禁止登录");
        } catch (IncorrectCredentialsException e) {
            return CommonResult.failed("密码不正确");
        } catch (AuthenticationException e) {
            return CommonResult.failed("用户验证失败");
        }
    }

    /**
     * 测试token登录接口
     * @return Result
     */
    @PostMapping("/test")
    @RequiresRoles("admin")
    public  CommonResult<String>  test(){
        return CommonResult.success("ok");
    }
}
