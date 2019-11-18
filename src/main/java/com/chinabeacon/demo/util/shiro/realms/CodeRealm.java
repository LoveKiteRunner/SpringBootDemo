/*
package com.chinabeacon.demo.util.shiro.realms;

import com.learn.shirojwtdemo.common.constant.ConstantRedisKey;
import com.learn.shirojwtdemo.common.util.RedisUtil;
import com.learn.shirojwtdemo.framework.shiro.token.CustomizedToken;
import com.learn.shirojwtdemo.project.pojo.User;
import com.learn.shirojwtdemo.project.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

*/
/**
 * @author lixiao
 * @date 2019/7/31 11:40
 *//*

@Slf4j
public class CodeRealm extends AuthorizingRealm {

    @Resource
    private UserService userService;

    @Resource
    private RedisUtil redisUtil;

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof CustomizedToken;
    }

    */
/**
     * 获取授权信息
     * @param principals principals
     * @return AuthorizationInfo
     *//*

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    */
/**
     * 获取身份认证信息
     * @param authenticationToken authenticationToken
     * @return AuthenticationInfo
     * @throws AuthenticationException AuthenticationException
     *//*

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        CustomizedToken token = (CustomizedToken) authenticationToken;
        log.info("CodeRealm"+token.getUsername()+"开始身份认证");
        // 根据手机号查询用户
        User user = userService.selectUserByPhone(token.getUsername());
        if (user == null) {
            // 抛出账号不存在异常
            throw new UnknownAccountException();
        }
        // 1.principal：认证的实体信息，可以是手机号，也可以是数据表对应的用户的实体类对象
        // 2.从redis中获取登录验证码
        Object credentials = redisUtil.get(ConstantRedisKey.getLoginCodeKey(user.getPhone()));
        if (credentials == null) {
            throw new ExpiredCredentialsException();
        }
        // 3.realmName：当前realm对象的name，调用父类的getName()方法即可

        // 4.盐,取用户信息中唯一的字段来生成盐值，避免由于两个用户原始密码相同，加密后的密码也相同
        ByteSource credentialsSalt = ByteSource.Util.bytes(user.getPhone());
        return new SimpleAuthenticationInfo(user, credentials, credentialsSalt, getName());
    }
}
*/
