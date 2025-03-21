package com.example.crud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.example.crud.model.Bike;
import com.example.crud.repositories.BikeRepository;

@Service
public class BikeService {
    @Autowired
    private BikeRepository bikeRepository;

    public List<Bike> getBikes() {
        return bikeRepository.findAll();
    }
    public Bike getBikeById(Long id) {
        return bikeRepository.findById(id).get();
    }
}
