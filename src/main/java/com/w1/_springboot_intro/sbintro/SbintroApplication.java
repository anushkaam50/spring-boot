package com.w1._springboot_intro.sbintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbintroApplication implements CommandLineRunner {
//    autowired - object of apple should inject in non-static main; injected apple dependency in SbintroApplication bean
    @Autowired
     Apple obj;

//  static main
	public static void main(String[] args) {
		SpringApplication.run(SbintroApplication.class, args);
	}

//    non-static main
    @Override
    public void run(String... args) throws Exception {
        obj.eatApple();
    }
}
