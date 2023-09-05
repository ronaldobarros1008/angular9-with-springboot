package com.rsb.clientes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.rsb.model.entity")
public class ClientesApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}

}
