package com.example.maco.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/saludo")
public class HolaMundoController {
    @GetMapping("/hola")
    public String hola(){
        return "Hola Oscar ";
    }
}
