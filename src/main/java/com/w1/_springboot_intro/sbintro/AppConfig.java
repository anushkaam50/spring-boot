package com.w1._springboot_intro.sbintro;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration // this class contains methods to define and configure beans
public class AppConfig {

//    eatApple is factory method
    @Bean
     Apple eatApple(){
        return new Apple();
    }
}
