package ru.nino.asistint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class one {

    @GetMapping("/welcome")
    public String helloWorld(){
        return "Hello World";

    }

}
