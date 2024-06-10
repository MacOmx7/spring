package com.macox.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages={"com.macox.market.persistence.mapper.ProductMapper"})
public class MacoxApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacoxApplication.class, args);
	}

}
