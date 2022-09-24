package com.mindtree.orchard.voterRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"com.mindtree.orchard"} )
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.mindtree.orchard")
@EntityScan(basePackages = "com.mindtree.orchard")
@EnableEurekaClient
public class VoterRegistrartion {

	public static void main(String[] args) {
		SpringApplication.run(VoterRegistrartion.class, args);
	}

}
