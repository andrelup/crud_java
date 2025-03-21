package com.example.crud.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "types")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL)
    private Set<Bike> bikeSet = new HashSet<Bike>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Bike> getBikeSet() {
        return bikeSet;
    }

    public void setBikeSet(Set<Bike> bikeSet) {
        this.bikeSet = bikeSet;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", bikeSet=" + bikeSet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Type type = (Type) o;
        return Objects.equals(getId(), type.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }
}
