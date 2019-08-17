package com.example.demo.multiThread;

import org.testng.annotations.Test;

/**
 * Created by 25131 on 2019/8/16.
 */
public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test() {
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
