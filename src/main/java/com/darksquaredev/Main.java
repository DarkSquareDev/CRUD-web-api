package com.darksquaredev;

import com.darksquaredev.customer.Customer;
import com.darksquaredev.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
        SpringApplication.run(Main.class, args);


    }
    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {

        return args -> {
            Customer Mihlali = new Customer(
                    "Mihlali",
                    "mihlali@gmail.com",
                    20
            );


            Customer Siya = new Customer(
                    "Siya",
                    "siya@gmail.com",
                    18
            );
          List<Customer> customers =List.of(Siya, Mihlali);
          customerRepository.saveAll(customers);
        };
    }
}
