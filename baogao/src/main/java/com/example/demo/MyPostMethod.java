package com.example.demo;

import com.example.demo.bean.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
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

    @RequestMapping(value = "/getUserList", method = RequestMethod.POST)
    @ApiOperation(value = "��ȡ�û��б�", httpMethod = "POST")
    public String getUserList(HttpServletRequest request,
                              @RequestBody User u) {
    User user;
        Cookie[] cookies = request.getCookies();
        for (Cookie c:cookies){
           if(c.getName()=="login"
              && c.getValue()=="true"
                   &&u.getUserName()=="zhangsan"
                   &&u.getPassword()=="123456") {
               user=new User();
               user.setName("lisi");
               user.setAge("18");
               user.setSex("man");
               return user.toString();
           }
        }
        return "�������Ϸ�";
    }
}

