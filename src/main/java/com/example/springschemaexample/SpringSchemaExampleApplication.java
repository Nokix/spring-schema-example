package com.example.springschemaexample;

import com.example.springschemaexample.repository.OrderRepository;
import com.example.springschemaexample.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringSchemaExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringSchemaExampleApplication.class, args);
    }

    @Bean
    public CommandLineRunner app(OrderRepository orderRepository,
                                 UserRepository userRepository) {
        return args -> {
            orderRepository.findAll().forEach(System.out::println);
            userRepository.findAll().forEach(System.out::println);
        };
    }

}
