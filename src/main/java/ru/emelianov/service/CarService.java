package ru.emelianov.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.emelianov.model.Car;
import ru.emelianov.repository.CarRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getAllCars() {
        List<Car> result = new ArrayList<>();
        carRepository.findAll().forEach(result::add);
        return result;
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).get();
    }
}
