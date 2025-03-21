package com.example.crud.repositories;

import com.example.crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    @Query("SELECT u, v FROM User u LEFT JOIN Vehicle v ON u.id = v.user.id WHERE u.active = true AND v.active = false")
    List<User> findActiveUsersWithInactiveVehicles();
}
