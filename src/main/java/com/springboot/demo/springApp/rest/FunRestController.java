package com.springboot.demo.springApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // inject properties for: coach.name and team,name

    @Value("${coach.name}")
    private  String coachName;
    @Value("${team.name}")
    private String teamName;

    //expose new endpoint for "teaminfo"
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return  "Coach: " + coachName + " , Team name: " + teamName;
    }

    // expose "/" that return "Hello world"
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
