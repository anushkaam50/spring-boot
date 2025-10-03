package com.w1._springboot_intro.sbintro;

import org.springframework.stereotype.Component;

@Component
public class devDB implements DB {

    public String getdata(){ // when implementing any class need to change access modifier to public
        return "Dev Database";
    }
}
