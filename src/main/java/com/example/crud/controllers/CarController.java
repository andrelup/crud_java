package com.example.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.crud.model.Car;
import com.example.crud.model.User;
import com.example.crud.services.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/")
    public ResponseEntity<List<Car>> getCars() {
        return ResponseEntity.ok(carService.getCars());
    }

    @GetMapping("/by/id/{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Long id) {
        return ResponseEntity.ok(carService.getCarById(id));
    }
    @GetMapping("/by/plate/{plate}")
    public ResponseEntity<Car> getCarByPlate(@PathVariable String plate) {
        return ResponseEntity.ok(carService.findByPlate(plate));
    }
}
