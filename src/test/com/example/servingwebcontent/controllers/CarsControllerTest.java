package com.example.servingwebcontent.controllers;

import com.example.servingwebcontent.models.Car;

import com.example.servingwebcontent.services.CarService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(MockitoExtension.class)
class CarsControllerTest {

    @InjectMocks
    CarsController carsController;
    @Mock
    CarService carService;

    @Test
    void postUser() {
        Mockito.when(carService.getCars(eq(3))).thenReturn(new Car());
        ResponseEntity result = carsController.allUsers(3);
        assertEquals(ResponseEntity.ok(new Car()), result);
    }
}