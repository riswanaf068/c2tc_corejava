package com.tnsif.sm.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

public class ShoppingMallManagementProductApplication {

	public static void main(String[] args) {
	SpringApplication.run(ShoppingMallManagementProductApplication.class, args);
	}

}
