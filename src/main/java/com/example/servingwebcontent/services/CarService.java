package com.example.servingwebcontent.services;

import com.example.servingwebcontent.models.Car;

public interface CarService {

    Car PostCar(Car car);

    Object getCars(Integer id);

}
