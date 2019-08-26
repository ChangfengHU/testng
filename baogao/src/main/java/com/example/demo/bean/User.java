package com.example.demo.bean;

import lombok.Data;

/**
 * Created by ºúÎÄ»ª on 2019/8/25.
 */
@Data
public class User {
    private String userName;
    private String password;
    private String name;
    private String age;
    private String sex;

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
