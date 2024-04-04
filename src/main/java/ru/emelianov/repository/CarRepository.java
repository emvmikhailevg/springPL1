package ru.emelianov.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.emelianov.model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {}
