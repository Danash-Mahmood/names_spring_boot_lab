package com.example.task_01.ModelsPackage;

public class Greeting {

    String name;

    String timeOfDay;


    public Greeting(String name, String timeOfDay){
        this.name = name;
        this.timeOfDay = timeOfDay;
    }



    public Greeting(){

    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        return this.name;
    }

    public void setTimeOfDay(String timeOfDay){
        this.timeOfDay = timeOfDay;
    }

    public String getTimeOfDay(){
        return this.timeOfDay;
    }







}
