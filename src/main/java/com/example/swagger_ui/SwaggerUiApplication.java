package com.example.swagger_ui;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableSwagger2Doc
@SpringBootApplication
public class SwaggerUiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerUiApplication.class, args);
    }

}
