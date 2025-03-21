package com.example.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.crud.repositories.CarRepository;
import com.example.crud.model.Car;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Long id) {
        return carRepository.findById(id).get();
    }

    public Car findByPlate(String plate) {
        return carRepository.findByPlate(plate);
    }
}