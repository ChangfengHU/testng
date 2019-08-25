package com.example.demo;

import com.sun.net.httpserver.HttpServer;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Created by 胡文华 on 2019/8/23.
 */
@RestController
@Api(value="/",description="这是我全部的get 方法")
public class MyGetMethod {
  @RequestMapping(value = "/getCookies",method= RequestMethod.GET)
  @ApiOperation(value = "通过这个方法可以获得cookies",httpMethod="GET")
    public String getCookies(HttpServletResponse response) {
        Cookie cookie=new Cookie("login","true");
        response.addCookie(cookie);
        return "cookies";
    }

   @RequestMapping(value = "/get/with/cookies", method = RequestMethod.GET)
   @ApiOperation(value = "要求客户端携带cookies访问",httpMethod="GET")
    public String getWithCookies(HttpServletRequest request) {
        Cookie[] cookies =request.getCookies();
        if (Objects.isNull(cookies)) {
            return "xiedai cookies";
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login")&& cookie.getValue().equals("true")) {
                return "访问成功";
            }
        }
            return "xiedai cookies";
    }
    //携带参数访问的get请求
    //url:ip:/get/with/param?start=10&end=20
    //模拟获取商品列表
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "携带参数访问的get请求方法一",httpMethod="GET")
    public Map<String,Integer> getList(@RequestParam Integer start,
                                       @RequestParam Integer end) {
        Map<String, Integer> MyList = new HashMap<String, Integer>();
        MyList.put("鞋",400);
        MyList.put("干脆面",1);
        MyList.put("衬衫",400);
        return  MyList;
    }
    //携带参数访问的get请求
    //url:ip:/get/with/param/10/20
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "携带参数访问的get请求方法二",httpMethod="GET")
    public Map<String,Integer> myGetList(@PathVariable Integer start,
                         @PathVariable Integer end) {
        Map<String, Integer> MyList = new HashMap<String, Integer>();
        MyList.put("鞋",400);
        MyList.put("干脆面",2);
        MyList.put("衬衫",400);
        return  MyList;
    }
}
