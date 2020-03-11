package com.example.servingwebcontent.services.impl;


import com.example.servingwebcontent.models.Car;
import com.example.servingwebcontent.repositorys.CarsRepository;
import com.example.servingwebcontent.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarsServiceImpl implements CarService {
    @Autowired
    CarsRepository carsRepository;


    @Override
    public Car PostCar(Car car) {
        return carsRepository.save(car);
    }

    @Override
    public Object getCars(Integer id) {

        if (id == null) {
            return carsRepository.findAll();
        } else {
            return carsRepository.findById(id).get();

        }
    }
}
