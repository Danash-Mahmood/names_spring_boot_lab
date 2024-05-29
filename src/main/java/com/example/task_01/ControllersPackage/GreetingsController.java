package com.example.task_01.ControllersPackage;

import com.example.task_01.ModelsPackage.Celebration;
import com.example.task_01.ModelsPackage.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController{

//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(defaultValue = "" ) String name){
//        return String.format("Good afternoon %s",name);
//    }


    @GetMapping("/greeting")

    public Greeting greetingMethod(@RequestParam(defaultValue = "") String timeOfDay){
         return new Greeting("Dan",timeOfDay);



    }
    @GetMapping("/greeting/summer")

    public Celebration celebrationMethod(){
        return new Celebration("Happy summer solstice");
    }

    @GetMapping("/greeting/season")

    public Celebration celebrationMethod(@RequestParam(defaultValue = "") String season){
        return new Celebration(String.format("Happy %s",season ));
    }











}


