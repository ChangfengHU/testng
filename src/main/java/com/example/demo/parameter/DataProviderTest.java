package com.example.demo.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by 25131 on 2019/8/16.
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name=" + name + "; age=" + age);
    }

    @DataProvider(name = "data")
    public Object[][] dataProvider() {
        Object[][] o = new Object[][]{
                {"zhangsan", 10},
                {"lisi", 20},
                {"wangwu", 30}         //简单的把参数放到方法里

        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test111方法 name=" + name + "; age=" + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test222方法 name=" + name + "; age=" + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan", 20},
                    {"lisi", 25},
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"wangwu", 50},
                    {"zhaoliu", 60},        //通过方法名传递参数
            };
        }
        return result;
    }
}
