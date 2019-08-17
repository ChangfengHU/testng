package com.example.demo.groups;

import org.testng.annotations.Test;

/**
 * Created by 25131 on 2019/8/15.
 */
public class DependTest {
    @Test(expectedExceptions = Exception.class)
    public void test1() {
        System.out.println("test1 run");
        boolean flag=true;
    }


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
    }


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2() {
        System.out.println("test2 run");
    }
}
