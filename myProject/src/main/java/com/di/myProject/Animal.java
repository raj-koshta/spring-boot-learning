package com.di.myProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Animal {

//    Case: 1
//    private Dog dog; // NullPointerException because Dog obj not initialized

//    Case: 2
//    private Dog dog = new Dog(); // Successfully run But we have to do manually here Spring boot comes in
//    picture and provide us one annotation which help us to get the obj from the IoC Container

//    Case: 3
//    @Autowired
//    private Dog dog; // Field Dependency Injection
//     We use Autowired annotation which help us to get the object from IoC container

//    Case: 4
//    private Dog dog; // Veriable declaration
//
//    @Autowired
//    public void setDog(Dog dog) {
//        this.dog = dog;
//    }
//    Setter Dependency Injection, When we do DI using Setters then we have to use @Autowired annotation to perform DI

//        Case: 5
    private Dog dog; // Variable declaration

    public Animal(Dog dog){
        this.dog = dog;
    }
    // Constructor Dependency Injection, When we do DI using Constructor then it is optional to use @Autowired
    // annotation to perform DI When we only have one constructor


    @GetMapping("/voice")
    public String animalVoice(){
        return dog.voice();
    }
}
