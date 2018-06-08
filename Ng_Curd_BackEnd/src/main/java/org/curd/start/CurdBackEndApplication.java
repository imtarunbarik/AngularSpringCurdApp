package org.curd.start;

import org.curd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "org.curd.usercontroller" })
@EntityScan("org.curd.model")
@EnableJpaRepositories("org.curd.repository")
public class CurdBackEndApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(CurdBackEndApplication.class, args);
	}//main

	@Override
	public void run(String... args) throws Exception {

	}// run
}// class
