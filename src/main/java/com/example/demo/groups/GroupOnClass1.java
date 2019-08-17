package com.example.demo.groups;

import org.testng.annotations.Test;

/**
 * Created by 25131 on 2019/8/15.
 */
@Test(groups = "stu")
public class GroupOnClass1 {
    public void stu1() {
        System.out.println("GroupOnClass1中stu1运行");
    }
    public void stu2() {
        System.out.println("GroupOnClass1中stu2运行");
    }
}
