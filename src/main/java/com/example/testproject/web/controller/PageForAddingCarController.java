package com.example.testproject.web.controller;

import com.example.testproject.web.model.Car;
import com.example.testproject.web.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pageOfCarsForAdmin/pageForAddingCar")
public class PageForAddingCarController {

    private final CarService carService;

    @Autowired
    public PageForAddingCarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String pageForAddingCar(){
        return "PageForAddingCar";
    }

    @PostMapping
    public String AddingCar(Car car){
        carService.createCar(car);
        return "redirect:/pageOfCarsForAdmin";
    }

}
