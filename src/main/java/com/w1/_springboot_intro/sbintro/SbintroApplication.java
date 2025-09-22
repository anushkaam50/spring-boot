package com.w1._springboot_intro.sbintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbintroApplication implements CommandLineRunner {
//    autowired - object of apple should inject in non-static main; injected apple dependency in SbintroApplication bean
    @Autowired
     Apple a1;

    @Autowired
    Apple a2;

//  static main
	public static void main(String[] args) {
		SpringApplication.run(SbintroApplication.class, args);
	}

//    non-static main
    @Override
    public void run(String... args) throws Exception {
        a1.eatApple();
        a2.eatApple();

        System.out.println(a1.hashCode() == a2.hashCode() ? "true" : "false");


//    2025-09-22T22:52:41.617+05:30  INFO 14791 --- [sbintro] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1294 ms
//    PostConstruct - This is initializing the bean before using it
//    PostConstruct - This is initializing the bean before using it
//2025-09-22T22:52:42.105+05:30  INFO 14791 --- [sbintro] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
//            2025-09-22T22:52:42.116+05:30  INFO 14791 --- [sbintro] [           main] c.w._.sbintro.SbintroApplication         : Started SbintroApplication in 2.605 seconds (process running for 3.142)
//    Bean is used thr' psvm call - Im eating
//    Bean is used thr' psvm call - Im eating
//            false
    }
}
