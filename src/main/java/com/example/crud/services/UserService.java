package com.example.crud.services;

import com.example.crud.model.User;
import com.example.crud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }
    public User getUserById(Long id) {
        return userRepository.findById(id).get();
    }
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
    public List<User> getActiveUsersWithInactiveVehicles() {
        List<User> activeUsers = userRepository.findActiveUsersWithInactiveVehicles();
        for (User user : activeUsers) {
            user.setVehicles(
                    user.getVehicles().stream()
                            .filter(vehicle -> !vehicle.isActive())
                            .collect(Collectors.toSet())
            );
        }
        return activeUsers;
    }

}
