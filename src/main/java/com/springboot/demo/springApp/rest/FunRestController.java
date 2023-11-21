package com.springboot.demo.springApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello world";
    }

    //new endpoint for "workout"
    @GetMapping("/workout")
    public  String getDailyWorkout(){
        return  "Run 5k daily";
    }

    //new endpoint for "Meditate"
    @GetMapping("/meditate")
    public  String getDailyMeditation(){
        return "Meditate for 30 min";
    }
}
