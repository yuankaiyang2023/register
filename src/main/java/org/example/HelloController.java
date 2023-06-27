package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yuankai Yang
 */
@SpringBootApplication
@RestController
public class HelloController {
    @Value("${server.port}")
    String port;
    @RequestMapping("/hello")
    public String home(String name) {
        return "hi "+name+",i am from port:" +port;
    }
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
 
}