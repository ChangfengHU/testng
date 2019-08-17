package com.example.demo;

import org.testng.annotations.Test;

/**
 * Created by 25131 on 2019/8/15.
 */
public class Ignore {
    @Test
    public void ignore1() {
        System.out.println("ignore1");
    }
    @Test(enabled = false)
    public void ignore21() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore212() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore223() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2123() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2sdff() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2ag() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2h() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2j() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2asdf3() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2asdf() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2gag() {
        System.out.println("ignore2");
    }  
    @Test(enabled = false)
    public void ignore2hjj() {
        System.out.println("ignore2");
    }  
    @Test(enabled =false)
    public void ignore3() {
        System.out.println("ignore3");
    }
}
