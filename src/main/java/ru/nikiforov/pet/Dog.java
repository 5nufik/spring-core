package ru.nikiforov.pet;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * todo Document type Dog
 */

@Component
public class Dog implements Pet {

    private String name;

    public Dog() {
        System.out.println("Dog is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    private void init() {
        System.out.println("Dog init method");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Dog destroy method");
    }
}