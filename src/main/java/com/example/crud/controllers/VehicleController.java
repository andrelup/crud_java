package com.example.crud.controllers;


import com.example.crud.model.Vehicle;
import com.example.crud.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/")
    public ResponseEntity<List<Vehicle>> getVehicles() {
        return  ResponseEntity.ok(vehicleService.getVehicles());
    }

}