package com.naya.personbd.controllers;

import com.naya.mainmethodstarter.aop.StadnardRestController;
import com.naya.personbd.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Evgeny Borisov
 */
@StadnardRestController
@RequestMapping("/api")
public class MyController {

    public String ping(){
        return "OK";
    }


    @GetMapping("/person")
    public Person person(){
        return Person.builder().age(49).name("Andrey").build();
    }
}
