package com.example.demo;

import org.testng.annotations.Test;

/**
 * Created by 25131 on 2019/8/16.
 */
public class TimeOutTest {
    @Test(timeOut = 100)  //单位为毫秒值
    public void testSuccess() throws  InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed()  throws  InterruptedException{
        Thread.sleep(3000);
    }
}
