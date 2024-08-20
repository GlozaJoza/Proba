package com.example.proba;

import com.example.proba.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class ProbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProbaApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerRepository customerRepository) {
		return args -> {

			List<Account> accounts = new ArrayList<>();
			List<Account> accounts2 = new ArrayList<>();
			List<Account> accounts3 = new ArrayList<>();
			accounts.add((new Account("pero123","tekuci",205.5,100.1)));
			accounts2.add((new Account("ivica123","ziro",20000.5,500.2)));
			accounts3.add((new Account("ante45","bajs",5.5,0.1)));



			Customer pero = new Customer("Pero","Lonjska","pero@gmail.com","3859752",accounts);
			Customer ante = new Customer("Ante","Bribirska","ante@gmail.com","3859178",accounts2);
			Customer ivo = new Customer("Ivo","Drivenicka","ivo@hotmail.com","3859568",accounts3);

			customerRepository.save(pero);
			customerRepository.save(ante);
			customerRepository.save(ivo);

		};
	}

}
