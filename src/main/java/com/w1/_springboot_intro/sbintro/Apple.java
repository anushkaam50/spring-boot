package com.w1._springboot_intro.sbintro;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component - stereotype annotation
public class Apple {

    void eatApple(){
        System.out.println("Bean is used thr' psvm call - Im eating");
    }

//    PostConstruct  - it is used after object/bean creation, but doesnt require to access method under it thr' object in psvm
    @PostConstruct
    void CallBeforeBeanIsUsed(){
        System.out.println("PostConstruct - This is initializing the bean before using it");
    }

//    2025-09-22T21:53:04.996+05:30  INFO 13327 --- [sbintro] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1287 ms
//    PostConstruct - This is initializing the bean before using it
//     2025-09-22T21:53:05.511+05:30  INFO 13327 --- [sbintro] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
//     2025-09-22T21:53:05.524+05:30  INFO 13327 --- [sbintro] [           main] c.w._.sbintro.SbintroApplication         : Started SbintroApplication in 2.588 seconds (process running for 3.042)
//    Bean is used thr' psvm call - Im eating

    @PreDestroy
    void CallBeforeDestroy(){
        System.out.println("PreDestroy - Printed when application context shut down or bean no longer needed");
    }
//    2025-09-22T22:03:25.842+05:30  INFO 13649 --- [sbintro] [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1337 ms
//    PostConstruct - This is initializing the bean before using it
//2025-09-22T22:03:26.385+05:30  INFO 13649 --- [sbintro] [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port 8080 (http) with context path '/'
//            2025-09-22T22:03:26.395+05:30  INFO 13649 --- [sbintro] [           main] c.w._.sbintro.SbintroApplication         : Started SbintroApplication in 2.637 seconds (process running for 3.163)
//    Bean is used thr' psvm call - Im eating
//            2025-09-22T22:03:32.662+05:30  INFO 13649 --- [sbintro] [ionShutdownHook] o.s.b.w.e.tomcat.GracefulShutdown        : Commencing graceful shutdown. Waiting for active requests to complete
//2025-09-22T22:03:32.666+05:30  INFO 13649 --- [sbintro] [tomcat-shutdown] o.s.b.w.e.tomcat.GracefulShutdown        : Graceful shutdown complete
//    PreDestroy - Printed when application context shut down or bean no longer needed

}
