package com.e_commerce.demo;

import com.e_commerce.demo.app.App;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoStoreApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		App app = new App();

		app.displayMenu();
	}
}
