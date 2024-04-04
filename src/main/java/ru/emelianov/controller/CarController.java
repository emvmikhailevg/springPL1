package ru.emelianov.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ru.emelianov.model.Car;
import ru.emelianov.service.CarService;

import java.util.List;

@RestController
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getCarList() {
        return carService.getAllCars();
    }

    @GetMapping("/cars/{id}")
    public Car getCatById(@PathVariable(name = "id") Long id) {
        return carService.getCarById(id);
    }
}
