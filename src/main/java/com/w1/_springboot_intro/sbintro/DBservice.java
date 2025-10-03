package com.w1._springboot_intro.sbintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBservice {

    @Autowired
    devDB dev_DB; // tightly coupled where DBservice could able to access devDB

    String getdata(){
        return dev_DB.getdata();
    }
}
