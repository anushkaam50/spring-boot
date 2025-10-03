package com.w1._springboot_intro.sbintro;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class prodDB implements DB {

    public String getdata(){ // when implementing any class need to change access modifier to public
        return "Prod Database";
    }
}
