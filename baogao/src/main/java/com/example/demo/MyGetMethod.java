package com.example.demo;

import com.sun.net.httpserver.HttpServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by ºúÎÄ»ª on 2019/8/23.
 */
@RestController
public class MyGetMethod {
    @RequestMapping(value = "/getCookies",method= RequestMethod.GET)
    public String getCookies(HttpServletResponse response) {
        Cookie cookie=new Cookie("login","true");
        response.addCookie(cookie);
        return "cookies";
    }
}
