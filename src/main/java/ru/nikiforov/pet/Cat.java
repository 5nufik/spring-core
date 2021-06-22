package ru.nikiforov.pet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * todo Document type Cat
 */

@Component
public class Cat implements Pet {

    @Value("${cat.name}")
    private String name;

    public Cat() {
        System.out.println("Cat is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }

    @PostConstruct
    private void init() {
        System.out.println("Cat init method");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Cat destroy method");
    }
}