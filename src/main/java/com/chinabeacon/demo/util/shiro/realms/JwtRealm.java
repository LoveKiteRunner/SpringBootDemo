package com.chinabeacon.demo.util.shiro.realms;

import com.chinabeacon.demo.contant.enums.ResultEnums;
import com.chinabeacon.demo.mbg.model.Syspermission;
import com.chinabeacon.demo.mbg.model.Sysrole;
import com.chinabeacon.demo.mbg.model.Sysuser;
import com.chinabeacon.demo.service.SysuserService;
import com.chinabeacon.demo.util.shiro.JwtUtil;
import com.chinabeacon.demo.util.shiro.token.JwtToken;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author lixiao
 * @date 2019/8/6 10:02
 */
public class JwtRealm extends AuthorizingRealm {

    @Autowired
    private SysuserService sysuserService;

/*    @Autowired
    private UserRoleService userRoleService;*/

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JwtToken;
    }

    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Sysuser user = sysuserService.findByUserId(JwtUtil.getUserId(principals.toString()));
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        if (null == user) {
            return authorizationInfo;
        }
        //todo get roles permissions from db
// 赋予角色
      /*  List<Sysrole> roleList = roleService.listRolesByUserId(user.getId());
        for (Sysrole role : roleList) {
            authorizationInfo.addRole(role.getName());
        }*/
        authorizationInfo.addRole("admin");
        authorizationInfo.addRole("student");
        // 赋予权限
       /* List<Syspermission> resourcesList = null;
        resourcesList = resourcesService.listByUserId(userId);
        if (!CollectionUtils.isEmpty(resourcesList)) {
            Set<String> permissionSet = new HashSet<>();
            for (Syspermission resources : resourcesList) {
                String permission = null;
                if (!StringUtils.isEmpty(permission = resources.getPermission())) {
                    permissionSet.addAll(Arrays.asList(permission.trim().split(",")));
                }
            }
            authorizationInfo.setStringPermissions(permissionSet);
        }*/
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {
        String token = (String) auth.getCredentials();
        // 解密获得token
        String userId = JwtUtil.getUserId(token);
        Sysuser user = sysuserService.findByUserId(userId);
        if (user == null || !JwtUtil.verify(token, user.getPassword())) {
            throw new IncorrectCredentialsException(ResultEnums.TOKEN_INVALID.getMsg());
        }
        return new SimpleAuthenticationInfo(token, token, "JwtRealm");
    }
}
