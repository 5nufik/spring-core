package ru.nikiforov.testConfigJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nikiforov.person.Person;

/**
 * todo Document type TestConfigJava
 */

public class TestConfigJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);

        Person person = context.getBean("person", Person.class);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.callPet();

        context.close();
    }
}