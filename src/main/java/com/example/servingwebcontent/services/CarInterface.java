package com.example.servingwebcontent.services;

import com.example.servingwebcontent.models.Car;
import org.springframework.http.ResponseEntity;

public interface CarInterface {

    Car PostCar(Car car);
    Object getCars(Integer id);

}
