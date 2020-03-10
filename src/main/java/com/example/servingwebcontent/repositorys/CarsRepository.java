package com.example.servingwebcontent.repositorys;

import com.example.servingwebcontent.models.Car;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarsRepository extends CrudRepository<Car, Integer> {

}

