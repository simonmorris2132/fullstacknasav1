package com.careerdevs.fullstacknasav1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Fullstacknasav1Application {

	public static void main(String[] args) {
		SpringApplication.run(Fullstacknasav1Application.class, args);
	}

}
