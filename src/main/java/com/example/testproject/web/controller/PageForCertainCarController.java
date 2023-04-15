package com.example.testproject.web.controller;

import com.example.testproject.web.model.Car;
import com.example.testproject.web.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@Controller
@RequestMapping
public class PageForCertainCarController {

    private final CarRepository carRepository;

    @Autowired
    public PageForCertainCarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @GetMapping("/pageOfCarsForAdmin/{id}")
    public String carDetails(@PathVariable(value = "id") long id, Model model) {
        Optional<Car> cars = carRepository.findById(id);
        ArrayList<Car> list = new ArrayList<>();
        cars.ifPresent(list::add);
        model.addAttribute("CarsForDetails", list);
        return "DetailsOfCertainCar";
    }

    @GetMapping("/pageOfCarsForAdmin/{id}/edit")
    public String CarEdit(@PathVariable(value = "id") long id, Model model) {
        if(!carRepository.existsById(id)){
            return "redirect:/pageOfCarsForAdmin";
        }

        Optional<Car> cars = carRepository.findById(id);
        ArrayList<Car> list = new ArrayList<>();
        cars.ifPresent(list::add);
        model.addAttribute("CarsForEdit", list);
        return "CarEdit";
    }

    @PostMapping("/pageOfCarsForAdmin/{id}/edit")
    public String CarPostEdit(@PathVariable(value = "id") long id,
                              @RequestParam String brand,
                              @RequestParam String model,
                              @RequestParam String color) {
        Car car = carRepository.findById(id).orElseThrow();
        car.setBrand(brand);
        car.setModel(model);
        car.setColor(color);
        carRepository.save(car);
        return "Congratulations";
    }

    @PostMapping("/pageOfCarsForAdmin/{id}/delete")
    public String CarPostEdit(@PathVariable(value = "id") long id){
        Car car = carRepository.findById(id).orElseThrow();
        carRepository.delete(car);
        return "Congratulations";
    }



}
