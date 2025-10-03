package com.w1._springboot_intro.sbintro;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@ConditionalOnProperty(name="deploy.env", havingValue = "production")
public class prodDB implements DB {

    public String getdata(){ // when implementing any class need to change access modifier to public
        return "Prod Database";
    }
}
