package com.example.testproject.web.service;

import com.example.testproject.web.model.Car;
import com.example.testproject.web.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository){
        this.carRepository = carRepository;
    }

    @Override
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    @Override
    public void createCar(Car car) {
        Car newCar = Car.builder()
                .brand(car.getBrand())
                .model(car.getModel())
                .color(car.getColor())
                .build();
        carRepository.save(newCar);
    }
}
