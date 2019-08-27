package com.example.demo.controller;

import com.example.demo.model.Person;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ���Ļ� on 2019/8/26.
 */
@RestController
public class IndexController {
    @RequestMapping(value = "/insert",method= {RequestMethod.GET,RequestMethod.POST})
    @ApiOperation(value = "ͨ������������")
    public String insert(String name, int age) {
        List<Person> list = new ArrayList<Person>();
        try {
            System.out.println("insert start" + name + "," + age);
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://127.0.0.1:3306/mao?characterEncoding=GBK";
            Connection conn = DriverManager.getConnection(jdbc, "root", "123456789");
            Statement state = conn.createStatement();
            String sql = "insert into user (name,age)values('" + name + "'," + age + ")";
            System.out.println(sql);
            state.executeUpdate(sql);
            Person p = new Person();
            p.setName(name);
            p.setAge(age);
            list.add(p);
            conn.close();

        } catch (Exception e) {
            System.err.println(e);
            return "error";
        }
        System.out.println("ִ������ӷ���");
        return list.toString();
    }
    @RequestMapping(value = "/delete1",method= {RequestMethod.GET,RequestMethod.POST})
    public String delete1(int id) {
        List<Person> list = new ArrayList<Person>();
        try {
            System.out.println("delete1 start" + id);
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://127.0.0.1:3306/mao?characterEncoding=GBK";
            Connection conn = DriverManager.getConnection(jdbc, "root", "123456789");

            Statement state = conn.createStatement();
            String sql = "delete from user where id=" + id;
            System.out.println(sql);
            System.out.println("ɾ����");
            state.executeUpdate(sql);

            String selectSql1 = "select * from user where  id=" + id;

            ResultSet rs = state.executeQuery(selectSql1);
            while (rs.next()) {
                Person p1 = new Person();
                //int id1 = rs.getInt("id");
                p1.setId(Integer.parseInt(rs.getString("id")));
                p1.setName(rs.getString("name"));
                //  p1.setAge(Integer.parseInt(rs.getString("age")));
                list.add(p1);
            }

            conn.close();

        } catch (Exception e) {
            System.err.println(e);
            return "error";
        }
        System.out.println("ִ���˄h������");
        return list.toString();

    }
    @RequestMapping(value = "/update",method= {RequestMethod.GET,RequestMethod.POST})
    public String update(int id, String name, int age) {
        List<Person> list = new ArrayList<Person>();
        try {
            System.out.println("update start:" + id + "," + name + "," + age);
            Class.forName("com.mysql.jdbc.Driver");
            String jdbc = "jdbc:mysql://127.0.0.1:3306/mao?characterEncoding=GBK";
            Connection conn = DriverManager.getConnection(jdbc, "root", "123456789");
            Statement state = conn.createStatement();
            String sql = "update user set name='" + name + "',age=" + age + " where id=" + id;
            System.out.println(sql);
            state.executeUpdate(sql);

            String selectSql = "select * from user where  id=" + id;

            ResultSet rs = state.executeQuery(selectSql);
            while (rs.next()) {
                Person p = new Person();
                //int id1 = rs.getInt("id");
                p.setId(Integer.parseInt(rs.getString("id")));
                p.setName(rs.getString("name"));
                p.setAge(Integer.parseInt(rs.getString("age")));
                list.add(p);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println(e);
            return "error";
        }
        System.out.println("ִ�����޸ķ���");
        return list.toString() ;
    }
    @RequestMapping(value = "/select",method= {RequestMethod.GET,RequestMethod.POST})
    public String select (String name,int age){
        // String a = "";
        List<Person> list = new ArrayList<Person>();
        try {
            System.out.println("select start");
            Class.forName("com.mysql.jdbc.Driver");//��������
            String jdbc = "jdbc:mysql://127.0.0.1:3306/mao?characterEncoding=GBK";
            Connection conn = DriverManager.getConnection(jdbc, "root", "123456789");//���ӵ����ݿ�
            Statement state = conn.createStatement();   //����

            String sql = "select * from user where name='" + name + "' and age=" + age;
            if (isaBoolean(name) && age > 0) {
                sql = "select * from user where   age=" + age;
            }
            if (!isaBoolean(name) && age <= 0) {
                sql = "select * from user where name='" + name+"'" ;
            }

            System.out.println(sql);
            System.out.println("�鿴��");

            ResultSet rs = state.executeQuery(sql);         //��sql����ϴ������ݿ�ִ��

            while (rs.next()) {
                Person p = new Person();
                //int id1 = rs.getInt("id");

                p.setName(rs.getString("name"));
                p.setAge(Integer.parseInt(rs.getString("age")));

                list.add(p);

            }
            rs.close();
            state.close();
            conn.close();//�ر�ͨ��
        } catch (Exception e) {
            System.err.println(e);
            return "error";
        }
        System.out.println("ִ���˲�ѯ����");
        //return "1:zhangsan:12 <br/> 2:zhangsan2:11";list
        return list.toString() ;
    }

    private boolean isaBoolean (String name){
        return "".equals(name) || name == null;
    }
}
