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
 * Created by ���Ļ� on 2019/8/24.
 */
@RestController
@Api(value="/",description="ȫ����post����")
@RequestMapping("/v1")
public class MyPostMethod {
    private static Cookie cookie;
@RequestMapping(value = "/login",method = RequestMethod.POST)
@ApiOperation(value="����ӿ�,�ɹ����ȡcookies��Ϣ",httpMethod="POST")
    public String login(HttpServletResponse response,
                        @RequestParam (value = "userName",required = true) String userName,
                        @RequestParam  (value = "password",required = true) String password) {
    if (userName.equals("zhangsan")&& password.equals("1234756")) {
        cookie =new Cookie("login","true");
        response.addCookie(cookie);
        return "��½�ɹ�";
    }
        return "�û������������";
    }
}

