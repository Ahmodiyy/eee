package com.example.eee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Erest {
    @GetMapping("/")
    public String getName(){
        return "eee applications";
    }
}
