package com.qfcwx.springbootjms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SpringbootJmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJmsApplication.class, args);
    }

}
