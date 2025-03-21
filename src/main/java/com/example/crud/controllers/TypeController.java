package com.example.crud.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.example.crud.model.Type;
import com.example.crud.services.TypeService;

@RestController
@RequestMapping("/types")
public class TypeController {
    @Autowired
    private TypeService typeService;

    @GetMapping("/")
    public ResponseEntity<List<Type>> getTypes() {
        return  ResponseEntity.ok(typeService.getTypes());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Type> getTypeById(@PathVariable Long id) {
        return ResponseEntity.ok(typeService.getTypeById(id));
    }
}
