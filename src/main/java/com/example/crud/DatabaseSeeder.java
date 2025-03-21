package com.example.crud;

import com.example.crud.model.*;
import com.example.crud.repositories.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//@Component
//public class DatabaseSeeder implements CommandLineRunner {

public class DatabaseSeeder {

    private final UserRepository userRepository;
    private final TypeRepository typeRepository;
    private final CarRepository carRepository;
    private final BikeRepository bikeRepository;

    public DatabaseSeeder(UserRepository userRepository, TypeRepository typeRepository, CarRepository carRepository, BikeRepository bikeRepository) {
        this.userRepository = userRepository;
        this.typeRepository = typeRepository;
        this.carRepository = carRepository;
        this.bikeRepository = bikeRepository;
    }

//    @Override
    public void run(String... args) throws Exception {
        // Seed de Usuarios
        User user1 = new User();
        user1.setName("Juan Pérez");
        user1.setEmail("juan.perez@ejemplo.com");
        user1.setPhone("654321987");
        user1.setAge(35);
        user1.setActive(true);

        User user2 = new User();
        user2.setName("Ana García");
        user2.setEmail("ana.garcia@ejemplo.com");
        user2.setPhone("987654321");
        user2.setAge(28);
        user2.setActive(true);

        User user3 = new User();
        user3.setName("Miguel Rodríguez");
        user3.setEmail("miguel.rodriguez@ejemplo.com");
        user3.setPhone("123456789");
        user3.setAge(42);
        user3.setActive(false);

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);

        // Seed de Tipos de Bicicleta
        Type tipo1 = new Type();
        tipo1.setDescription("Montaña");

        Type tipo2 = new Type();
        tipo2.setDescription("Carretera");

        Type tipo3 = new Type();
        tipo3.setDescription("Híbrida");

        typeRepository.save(tipo1);
        typeRepository.save(tipo2);
        typeRepository.save(tipo3);

        // Seed de Coches
        Car coche1 = new Car();
        coche1.setPlate("ABC1234");
        coche1.setCapacity(5);
        coche1.setElectrical(false);
        coche1.setColor("Rojo");
        coche1.setActive(true);
        coche1.setUser(user1);

        Car coche2 = new Car();
        coche2.setPlate("XYZ5678");
        coche2.setCapacity(4);
        coche2.setElectrical(true);
        coche2.setColor("Azul");
        coche2.setActive(true);
        coche2.setUser(user2);

        Car coche3 = new Car();
        coche3.setPlate("LMN8901");
        coche3.setCapacity(7);
        coche3.setElectrical(false);
        coche3.setColor("Negro");
        coche3.setActive(false);
        coche3.setUser(user3);

        carRepository.save(coche1);
        carRepository.save(coche2);
        carRepository.save(coche3);

        // Seed de Bicicletas
        Bike bicicleta1 = new Bike();
        bicicleta1.setColor("Amarillo");
        bicicleta1.setActive(true);
        bicicleta1.setBasket(true);
        bicicleta1.setType(tipo1);
        bicicleta1.setUser(user1);

        Bike bicicleta2 = new Bike();
        bicicleta2.setColor("Verde");
        bicicleta2.setActive(false);
        bicicleta2.setBasket(false);
        bicicleta2.setType(tipo2);
        bicicleta2.setUser(user2);

        Bike bicicleta3 = new Bike();
        bicicleta3.setColor("Blanco");
        bicicleta3.setActive(true);
        bicicleta3.setBasket(true);
        bicicleta3.setType(tipo3);
        bicicleta3.setUser(user3);

        bikeRepository.save(bicicleta1);
        bikeRepository.save(bicicleta2);
        bikeRepository.save(bicicleta3);

        System.out.println("Database seeded");
    }
}
