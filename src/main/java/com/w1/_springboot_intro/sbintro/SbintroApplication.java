package com.w1._springboot_intro.sbintro;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbintroApplication implements CommandLineRunner {

    Apple obj;

	public static void main(String[] args) {
		SpringApplication.run(SbintroApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {

    }
}
