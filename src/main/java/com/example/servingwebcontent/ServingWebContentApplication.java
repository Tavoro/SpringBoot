package com.example.servingwebcontent;


import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Log4j2
@SpringBootApplication
@EnableJpaRepositories
@EnableSwagger2

public class ServingWebContentApplication {


    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);




    }
}










