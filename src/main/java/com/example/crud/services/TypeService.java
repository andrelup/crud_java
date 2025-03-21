package com.example.crud.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.crud.model.Type;
import com.example.crud.repositories.TypeRepository;

@Service
public class TypeService {

    @Autowired
    private TypeRepository typeRepository;

    public List<Type> getTypes() {
        return typeRepository.findAll();
    }
    public Type getTypeById(Long id) {
        return typeRepository.findById(id).get();
    }
}
