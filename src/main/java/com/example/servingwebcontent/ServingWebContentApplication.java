package com.example.servingwebcontent;



import com.example.servingwebcontent.models.Car;
import com.example.servingwebcontent.models.User;
import lombok.extern.log4j.Log4j2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Log4j2
@SpringBootApplication
@EnableJpaRepositories
@EnableSwagger2

public class ServingWebContentApplication {



    static List<Car> list2 = new ArrayList<>();

    public static void main(String[] args) {
        SpringApplication.run(ServingWebContentApplication.class, args);



        log.trace("A TRACE Message");
        log.debug("A DEBUG Message");
        log.info("An INFO Message");
        log.warn("A WARN Message");
        log.error("An ERROR Message");

    }



}







