package com.example.demo;

import org.testng.annotations.*;

/**
 * Created by 25131 on 2019/8/14.
 */
public class Test1 {
    @Test
   public void testa (){
       System.out.println("我给你前");
    }
    @Test
   public void testb (){
       System.out.println("你给我前");
    }
    @BeforeMethod
   public void test1 (){
       System.out.println("BeforeMethod");
    }
    @BeforeClass
   public void test2 (){
       System.out.println("BeforeClass");
    }
    @BeforeSuite
   public void test3 (){
       System.out.println("BeforeSuite");
    }
    @AfterSuite
   public void test4 (){
       System.out.println("AfterSuite");
    }
    @AfterClass
   public void test5(){
       System.out.println("AfterClass");
    }
    @AfterMethod
   public void test6(){
       System.out.println("AfterMethod");
    }
}
