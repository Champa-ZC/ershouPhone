package com.qianfeng.recycle.service.impl;

import com.qianfeng.recycle.exception.PasswordErrorException;
import com.qianfeng.recycle.exception.UserHasRegisterException;
import com.qianfeng.recycle.exception.UsernameNotFoundException;
import com.qianfeng.recycle.mapper.UserMapper;
import com.qianfeng.recycle.po.TbUser;
import com.qianfeng.recycle.utils.MD5Utils;
import com.qianfeng.recycle.vo.LoginInfoVO;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 登录
     *
     * @param loginInfoVO
     */
    public TbUser login(LoginInfoVO loginInfoVO) throws Exception {
        if (loginInfoVO == null) {
            throw new NullPointerException("param is null");
        }
        String username = loginInfoVO.getUsername();
        String password = loginInfoVO.getPassword();
        if (null == username || "".equals(username)) {
            throw new NullPointerException("username is null");
        }

        //1、检验用户名在数据库是否存在
        TbUser tbUser = userMapper.checkUsername(username);
        if (tbUser == null) {
            throw new UsernameNotFoundException();
        }

        //2、密码校验
        //a、先对用户传入的密码进行加密
        String passwordSalt = "branzbly";
        String md5Password = MD5Utils.md5(password, passwordSalt);
        System.out.println("加盐后的密码："+md5Password);
        //b、同数据库的密文进行对比
        if (!md5Password.equals(tbUser.getPassword())) {
            throw new PasswordErrorException("password is error");
        }

        return tbUser;
    }

    /**
     * 用户注册
     * @param username
     * @param password
     */
    public void saveUser(String username,String password) throws Exception{
        if (null == username || "".equals(username)){
            throw new NullPointerException("username is null");
        }
        if (null == password || "".equals(password)){
            throw new NullPointerException("password is null");
        }
        TbUser user = userMapper.checkUsername(username);
        if (null != user ){
            throw new UserHasRegisterException();
        }
    }
}
