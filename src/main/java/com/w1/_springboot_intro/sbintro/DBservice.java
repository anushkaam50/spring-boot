package com.w1._springboot_intro.sbintro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBservice {

    @Autowired
    private DB db; // tightly coupled where DBservice could able to access devDB and prodDB, if not made @Primary to any 1 of 2 - devDB or prodDB

    String getdata(){
        return db.getdata();
    }
}
