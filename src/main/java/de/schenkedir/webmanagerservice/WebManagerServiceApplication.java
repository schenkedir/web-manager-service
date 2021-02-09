package de.schenkedir.webmanagerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class WebManagerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebManagerServiceApplication.class, args);
	}

}
