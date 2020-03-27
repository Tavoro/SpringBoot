package com.example.servingwebcontent.controllers;


import com.example.servingwebcontent.models.CarDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest")
public class RestTemplateController {

    @GetMapping
    public ResponseEntity<CarDto> allUsers(@RequestParam(name = "id", required = false) Integer id) {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders headers = new HttpHeaders();
        headers.set("agadffhtth", "application/json");

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<CarDto> response = restTemplate.exchange("http://localhost:8089/find", HttpMethod.GET, entity, CarDto.class);


        return response;

    }
}




