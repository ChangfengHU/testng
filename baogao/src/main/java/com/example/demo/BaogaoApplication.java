package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.demo"})//É¨Ãè½Ó¿Ú
@MapperScan(basePackages = "com.example.demo.mapper")
public class BaogaoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BaogaoApplication.class, args);
	}

}
