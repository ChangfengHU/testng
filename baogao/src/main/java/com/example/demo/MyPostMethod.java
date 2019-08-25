package com.example.demo;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 胡文华 on 2019/8/24.
 */
@RestController
@Api(value="/",description="全部的post请求")
@RequestMapping("/v1")
public class MyPostMethod {
    private static Cookie cookie;
@RequestMapping(value = "/login",method = RequestMethod.POST)
@ApiOperation(value="登入接口,成功后获取cookies信息",httpMethod="POST")
    public String login(HttpServletResponse response,
                        @RequestParam (value = "userName",required = true) String userName,
                        @RequestParam  (value = "password",required = true) String password) {
    if (userName.equals("zhangsan")&& password.equals("1234756")) {
        cookie =new Cookie("login","true");
        response.addCookie(cookie);
        return "登陆成功";
    }
        return "用户名或密码错误";
    }
}

