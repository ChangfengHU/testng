package com.example.demo;

import org.testng.annotations.Test;

/**
 * Created by 25131 on 2019/8/15.
 */
public class Exception {
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed() {
        System.out.println("这是一个失败的异常测试");
        //1执行测试用例

        //2/得到预期标识
        boolean flag=false;
        if (flag){

        }else {
            throw new RuntimeException();
        }
    }


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess() {
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }


}
