package com.example.customer.service;





import com.example.customer.service.entities.Customer;
import com.example.customer.service.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository){
		return args -> {
			customerRepository.save(new Customer(null,"Lamya","Lamya@gmail.com"));
			customerRepository.save(new Customer(null,"Walid","walid@gmail.com"));
			customerRepository.save(new Customer(null,"Ahmed","ahmed@gmail.com"));
			customerRepository.findAll().forEach(c->{
				System.out.println(c.toString());
			});
		};
	}

}
