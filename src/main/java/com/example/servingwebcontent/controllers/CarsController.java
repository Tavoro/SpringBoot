package com.example.servingwebcontent.controllers;


import com.example.servingwebcontent.services.CarInterface;
import com.example.servingwebcontent.models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarInterface carInterface;


    @PostMapping
    public Car postUser(Car car) {
        return carInterface.PostCar(car);
    }

    @GetMapping
    public ResponseEntity<Object> allUsers(@RequestParam(name = "id", required = false) Integer id) {
        return ResponseEntity.ok(carInterface.getCars(id));}
}




