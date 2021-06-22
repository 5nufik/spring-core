package ru.nikiforov.testAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.nikiforov.person.Person;

/**
 * todo Document type TestAnnotations
 */

public class TestAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext3.xml");

        Person person = context.getBean("person", Person.class);

        System.out.println(person.getName());
        System.out.println(person.getAge());

        person.callPet();

        context.close();
    }
}