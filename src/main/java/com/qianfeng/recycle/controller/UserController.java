package com.qianfeng.recycle.controller;

import com.qianfeng.recycle.exception.PasswordErrorException;
import com.qianfeng.recycle.exception.UsernameNotFoundException;
import com.qianfeng.recycle.po.TbUser;
import com.qianfeng.recycle.service.impl.UserService;
import com.qianfeng.recycle.vo.JsonResultVO;
import com.qianfeng.recycle.vo.LoginInfoVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @PostMapping("/login")
    public JsonResultVO loginAjax(LoginInfoVO loginInfoVO, HttpSession session){
        JsonResultVO jsonResultVO = new JsonResultVO();
        System.out.println(loginInfoVO.getUsername()+"---------"+loginInfoVO.getPassword());
    try {
        TbUser user = userService.login(loginInfoVO);
        session.setAttribute("user", user);
        jsonResultVO.setCode(1);
    } catch (NullPointerException e) {
        e.printStackTrace();
        jsonResultVO.setCode(0);
        jsonResultVO.setMsg("账号不能为空！");
    } catch (UsernameNotFoundException | PasswordErrorException e){
        e.printStackTrace();
        jsonResultVO.setCode(0);
        jsonResultVO.setMsg("账号或密码错误！");
    } catch (Exception e) {
        e.printStackTrace();
        jsonResultVO.setCode(0);
        jsonResultVO.setMsg("请联系管理员");
    }
        /*重定向不会经过视图解析器*/
        //{code:1,msg:'登录成功'}，code是用来进行条件判断的，msg用来显示
        return jsonResultVO;
    }

//    @ResponseBody
//    @PostMapping("/register")
//    public JsonResultVO registerAjax(String username,String password){
//        JsonResultVO jsonResultVO = new JsonResultVO();
//        try {
//            userService.saveUser(username,password);
//            jsonResultVO.setCode(1);
//        } catch (NullPointerException e) {
//            e.printStackTrace();
//            jsonResultVO.setCode(0);
//            jsonResultVO.setMsg("");
//        } catch (UsernameNotFoundException | PasswordErrorException e){
//            e.printStackTrace();
//            jsonResultVO.setCode(0);
//            jsonResultVO.setMsg("账号或密码错误！");
//        } catch (Exception e) {
//            e.printStackTrace();
//            jsonResultVO.setCode(0);
//            jsonResultVO.setMsg("请联系管理员");
//        }
//        /*重定向不会经过视图解析器*/
//        //{code:1,msg:'登录成功'}，code是用来进行条件判断的，msg用来显示
//        return jsonResultVO;
//    }
}
