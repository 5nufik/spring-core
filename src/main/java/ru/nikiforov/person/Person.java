package ru.nikiforov.person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import ru.nikiforov.pet.Pet;

/**
 * todo Document type Person
 */

//@Component
public class Person {
//    @Autowired
//    @Qualifier("dog")
    private Pet pet;

    @Value("${person.name}")
    private String name;

    @Value("${person.age}")
    private int age;

    public Person() {
        System.out.println("Person is created");
    }

    public Person(Pet pet) {
        System.out.println("Person is created");
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}