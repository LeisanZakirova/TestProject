package com.example.testproject.web.controller;

import com.example.testproject.web.model.Car;
import com.example.testproject.web.repositories.CarRepository;
import com.example.testproject.web.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class PageOfCarsController {

    @Autowired
    private final CarService carService;

    @Autowired
    private final CarRepository carRepository;


    public PageOfCarsController(CarService carService, CarRepository carRepository) {
        this.carService = carService;
        this.carRepository = carRepository;
    }

    @GetMapping("/pageOfCarsForAdmin")
    public String getAllCarsForAdmin(Model model) {
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        return "PageOfCarsForAdmin";
    }

}
