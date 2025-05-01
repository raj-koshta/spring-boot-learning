package com.di.myProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Dev {


    private Computer comp;

    public Dev(Computer comp) {
        this.comp = comp;
    }

    @GetMapping("/work")
    public String build() {

        return(comp.compile() + " -----------  Working with-in the project");
    }
}
