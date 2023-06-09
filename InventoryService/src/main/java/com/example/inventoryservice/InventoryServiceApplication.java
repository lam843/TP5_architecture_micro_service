package com.example.inventoryservice;

import com.example.inventoryservice.entities.Product;
import com.example.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){

        return args -> {

            productRepository.save(new Product(null,"Computer HP",800));
            productRepository.save(new Product(null,"iphone 14 pro max",900));
            productRepository.save(new Product(null,"MacBook Pro ",1800));
            productRepository.findAll().forEach(System.out::println);

        };

    }

}
