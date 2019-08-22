package com.example.demo;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import javax.swing.text.html.parser.Entity;
import java.io.IOException;

/**
 * Created by ºúÎÄ»ª on 2019/8/21.
 */
public class MyHttpClient {
    @Test
    public void test1()throws IOException {
        String result;
        HttpGet get=new HttpGet("http://www.baidu.com");
        HttpClient client=new DefaultHttpClient();
        HttpResponse response = client.execute(get);
        result= EntityUtils.toString(response.getEntity(),"utf-8");
        System.out.println(result);
    }
}
