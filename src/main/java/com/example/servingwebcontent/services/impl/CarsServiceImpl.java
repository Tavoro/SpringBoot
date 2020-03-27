package com.example.servingwebcontent.services.impl;

import com.example.servingwebcontent.services.CarInterface;
import com.example.servingwebcontent.models.Car;
import com.example.servingwebcontent.repositorys.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CarsServiceImpl implements CarInterface {
    @Autowired
    CarsRepository carsRepository;


    @Override
    public Car PostCar(Car car) {return carsRepository.save(car);}

    @Override
    public Object getCars(Integer id) {

        if  (id == null) {
            return carsRepository.findAll();
        }
        else {
            return carsRepository.findById(id).get();

        }
    }
}
