package com.example.crud.services;

import com.example.crud.model.Vehicle;

import com.example.crud.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getUsers() {
        return vehicleRepository.findAll();
    }
}