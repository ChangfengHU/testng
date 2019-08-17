package com.example.demo.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Created by 25131 on 2019/8/15.
 */
public class ParameterTest {
    @Test
    @Parameters({"name","age"})
    public void parameterTest1(String name,int age) {
        System.out.println("name="+name+",age="+age);

    }
}
