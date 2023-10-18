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
/*
* 1.Познакомится с гитом
*  1.1 гит комит
*    2 гит пуш
*    3 гит пул
* 2 задание
*  канкулятор на сложение вычитание
*
*
*
*
*
*
* */

