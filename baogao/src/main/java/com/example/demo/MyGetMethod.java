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
 * Created by ���Ļ� on 2019/8/23.
 */
@RestController
@Api(value="/",description="������ȫ����get ����")
public class MyGetMethod {
  @RequestMapping(value = "/getCookies",method= RequestMethod.GET)
  @ApiOperation(value = "ͨ������������Ի��cookies",httpMethod="GET")
    public String getCookies(HttpServletResponse response) {
        Cookie cookie=new Cookie("login","true");
        response.addCookie(cookie);
        return "cookies";
    }

   @RequestMapping(value = "/get/with/cookies", method = RequestMethod.GET)
   @ApiOperation(value = "Ҫ��ͻ���Я��cookies����",httpMethod="GET")
    public String getWithCookies(HttpServletRequest request) {
        Cookie[] cookies =request.getCookies();
        if (Objects.isNull(cookies)) {
            return "xiedai cookies";
        }
        for (Cookie cookie:cookies){
            if (cookie.getName().equals("login")&& cookie.getValue().equals("true")) {
                return "���ʳɹ�";
            }
        }
            return "xiedai cookies";
    }
    //Я���������ʵ�get����
    //url:ip:/get/with/param?start=10&end=20
    //ģ���ȡ��Ʒ�б�
    @RequestMapping(value = "/get/with/param",method = RequestMethod.GET)
    @ApiOperation(value = "Я���������ʵ�get���󷽷�һ",httpMethod="GET")
    public Map<String,Integer> getList(@RequestParam Integer start,
                                       @RequestParam Integer end) {
        Map<String, Integer> MyList = new HashMap<String, Integer>();
        MyList.put("Ь",400);
        MyList.put("�ɴ���",1);
        MyList.put("����",400);
        return  MyList;
    }
    //Я���������ʵ�get����
    //url:ip:/get/with/param/10/20
    @RequestMapping(value = "/get/with/param/{start}/{end}")
    @ApiOperation(value = "Я���������ʵ�get���󷽷���",httpMethod="GET")
    public Map<String,Integer> myGetList(@PathVariable Integer start,
                         @PathVariable Integer end) {
        Map<String, Integer> MyList = new HashMap<String, Integer>();
        MyList.put("Ь",400);
        MyList.put("�ɴ���",2);
        MyList.put("����",400);
        return  MyList;
    }
}
