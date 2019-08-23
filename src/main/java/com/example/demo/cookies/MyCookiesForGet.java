package com.example.demo.cookies;

import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

import static org.testng.TestRunner.PriorityWeight.dependsOnMethods;

/**
 * Created by ���Ļ� on 2019/8/22.
 */
public class MyCookiesForGet {
    private String url;
    private ResourceBundle bundle;
    @Before
    public void beforeTest() {
        bundle= ResourceBundle.getBundle("application");
        url=bundle.getString("test.url");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        //�������ļ���,ƴ�Ӳ��Ե�url
        String url=bundle.getString("getCookies.url");
        String testUrl=this.url+url;
        //�����߼�������д
        HttpGet get=new HttpGet(testUrl);
        DefaultHttpClient client=new DefaultHttpClient();
        HttpResponse response=client.execute(get);
        result= EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
        //��ȡcookies��Ϣ
        CookieStore store=client.getCookieStore();
        List<Cookie> cookieList=store.getCookies();
        for(Cookie cookie:cookieList){
            String name=cookie.getName();
            String value=cookie.getValue();
            System.out.println("cookie name="+name+"; cookie value="+value);
        }
    }

    @Test
    public void testGetWithCookies() throws IOException {
        String url=bundle.getString("test.get.with.cookies");
        String testUrl=this.url+url;
        HttpGet get=new HttpGet(testUrl);
        DefaultHttpClient client=new DefaultHttpClient();
        //��ȡcookies��Ϣ
        CookieStore store=client.getCookieStore();
        HttpResponse response=client.execute(get);
        //��ȡ��Ӧ��״̬��
        int statusCode=response.getStatusLine().getStatusCode();
        System.out.println("statusCode="+statusCode);
        if (statusCode==200) {
          String result= EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }
    }
}


