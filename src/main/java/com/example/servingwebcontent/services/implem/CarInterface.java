package com.example.servingwebcontent.services.implem;

import com.example.servingwebcontent.models.Car;
import org.springframework.http.ResponseEntity;

public interface CarInterface {

    Car PostCar(Car car);


    ResponseEntity getCars(Integer id);

}
