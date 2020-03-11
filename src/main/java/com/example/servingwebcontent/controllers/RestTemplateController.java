package com.example.servingwebcontent.controllers;


import com.example.servingwebcontent.models.Car;
import com.example.servingwebcontent.models.CarDto;
import com.example.servingwebcontent.services.implem.CarInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class RestTemplateController {

    @GetMapping
    public CarDto allUsers(@RequestParam(name = "id", required = false) Integer id) {
        RestTemplate restTemplate = new RestTemplate();


        CarDto result = restTemplate.getForObject("http://localhost:8089/find", CarDto.class);
        return result;

    }
}




