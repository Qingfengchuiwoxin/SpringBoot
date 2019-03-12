package com.qfcwx.springbootfileupload;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFileuploadApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootFileuploadApplication.class, args);
    }


//    @Bean
//    public MultipartConfigElement multipartConfigElement(){
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        factory.setMaxFileSize(DataSize.ofMegabytes(20));
//        factory.setMaxRequestSize(DataSize.ofMegabytes(30));
//        return factory.createMultipartConfig();
//    }
}
