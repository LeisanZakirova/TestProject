package com.example.testproject.web.service;

import com.example.testproject.web.model.Car;

import java.util.List;

public interface CarService {

    List<Car> getAllCars();

    void createCar(Car car);

}
