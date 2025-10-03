package com.w1._springboot_intro.sbintro;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name="deploy.env", havingValue = "development")
public class devDB implements DB {

    public String getdata(){ // when implementing any class need to change access modifier to public
        return "Dev Database";
    }
}
