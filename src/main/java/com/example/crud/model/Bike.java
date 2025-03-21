package com.example.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "bikes")
public class Bike  extends Vehicle {
    private boolean basket;

    @ManyToOne
    private Type type;

    public boolean isBasket() {
        return basket;
    }

    public void setBasket(boolean basket) {
        this.basket = basket;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return "Bike{"+
                "id=" + getId() +
                ", color='" + getColor() + '\'' +
                ", active=" + isActive() + '\'' +
                ", user=" + getUser() + '\'' +
                ", basket='" + basket + '\'' +
                ", type=" + type +
                '}';
    }

}
