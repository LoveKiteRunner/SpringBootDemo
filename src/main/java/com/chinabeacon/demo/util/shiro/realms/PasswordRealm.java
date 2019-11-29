package com.chinabeacon.demo.util.shiro.realms;
import com.chinabeacon.demo.mbg.model.Sysuser;
import com.chinabeacon.demo.service.SysuserService;
import com.chinabeacon.demo.util.shiro.token.CustomizedToken;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * @author lixiao
 * @date 2019/7/31 11:40*/


public class PasswordRealm extends AuthorizingRealm {

    @Autowired
    private SysuserService sysuserService;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof CustomizedToken;
    }

/**
     * 获取授权信息
     * @param principals principals
     * @return AuthorizationInfo*/


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

/**
     * 获取身份认证信息
     * @param authenticationToken authenticationToken
     * @return AuthenticationInfo
     * @throws AuthenticationException AuthenticationException*/


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        CustomizedToken token = (CustomizedToken) authenticationToken;
        // 根据手机号查询用户
        Sysuser user = sysuserService.findByUserName(token.getUsername());
        if (user == null) {
            // 抛出账号不存在异常
            throw new UnknownAccountException();
        }
        // 1.principal：认证的实体信息，可以是手机号，也可以是数据表对应的用户的实体类对象
        // 2.credentials：密码
        Object credentials = user.getPassword();
        // 3.realmName：当前realm对象的name，调用父类的getName()方法即可

        // 4.盐,取用户信息中用戶名和salt
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getUserName()+user.getSalt());
        return new SimpleAuthenticationInfo(user, credentials, credentialsSalt, getName());
    }
}
