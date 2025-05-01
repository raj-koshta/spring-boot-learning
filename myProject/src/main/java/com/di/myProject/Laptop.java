package com.di.myProject;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    @Override
    public String compile() {
        return("Compiling the code.....");
    }
}
