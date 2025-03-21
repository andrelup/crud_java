package com.example.crud.model;

import jakarta.persistence.*;

@Entity
@Table(name = "cars")
public class Car extends Vehicle {
    private String plate;
    private int capacity;
    private boolean electrical;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isElectrical() {
        return electrical;
    }

    public void setElectrical(boolean electrical) {
        this.electrical = electrical;
    }

    @Override
    public String toString() {
        return "Car{"+
                "id=" + getId() +
                ", color='" + getColor() + '\'' +
                ", active=" + isActive() + '\'' +
                ", user=" + getUser() + '\'' +
                ", plate='" + plate + '\'' +
                ", capacity=" + capacity + '\'' +
                ", electrical=" + electrical +
                '}';
    }
}


