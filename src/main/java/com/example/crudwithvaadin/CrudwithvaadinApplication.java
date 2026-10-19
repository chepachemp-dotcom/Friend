package com.example.crudwithvaadin;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CrudwithvaadinApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrudwithvaadinApplication.class, args);
    }

    @Bean
    public CommandLineRunner loadData(CustomerRepository repository) {
        return args -> {
            repository.save(new Customer("Danyil", "Lazariev"));
            repository.save(new Customer("Cristiano", "Ronaldo"));
            repository.save(new Customer("Michael", "Jackson"));
            repository.save(new Customer("Travis", "Scott"));
            repository.save(new Customer("Sponge", "Bob"));
        };
    }
}