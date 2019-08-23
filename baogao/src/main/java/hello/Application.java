package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by ºúÎÄ»ª on 2019/8/23.
 */
@SpringBootApplication
@ComponentScan("com.example.demo")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
