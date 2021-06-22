package ru.nikiforov.testCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.nikiforov.person.Person;

/**
 * todo Document type TestCore2
 */

public class TestCore2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

//        Pet pet = context.getBean("myPet", Pet.class);

        Person person = context.getBean("myPerson", Person.class);

        person.callPet();

        System.out.println(person.getName() + " " + person.getAge());

        context.close();
    }
}