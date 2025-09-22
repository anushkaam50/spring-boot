package com.w1._springboot_intro.sbintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration // this class contains methods to define and configure beans
public class AppConfig {

//    eatApple is factory method
    @Bean
//    @Scope("singleton") // default scope is always singleton; for n of objects, generated hashcode is same for Apple Bean
//    @Scope("prototype") // hashcode will be different for each this Apple Bean
     Apple eatApple()    {             // creates bean
     return new Apple();}               // registers bean
}
