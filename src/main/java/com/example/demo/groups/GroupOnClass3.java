package com.example.demo.groups;

import org.testng.annotations.Test;

/**
 * Created by 25131 on 2019/8/15.
 */
@Test(groups = "teacher")
public class GroupOnClass3 {
    public void teacher1() {
        System.out.println("GroupOnClass3 中的teacher1運行");
    }
    public void teacher2() {
        System.out.println("GroupOnClass3 中的teacher2運行");
    }
}
