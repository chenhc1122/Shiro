package com.yqz.springbootshiro.config;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

public class UserRealm extends AuthorizingRealm {
//    授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("执行了授权--------------doGetAuthorizationInfo");
        return null;
    }

//    认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {


        System.out.println("执行了认证--------------------doGetAuthenticationInfo");
//        用户名密码数据库取
        String username = "chenhc";
//        String password = "chc123";
        UsernamePasswordToken userToken = (UsernamePasswordToken) token;
          if(!userToken.getUsername().equals(username)){
              return null;
          }
        return new SimpleAuthenticationInfo("","chc123","");
    }
}
