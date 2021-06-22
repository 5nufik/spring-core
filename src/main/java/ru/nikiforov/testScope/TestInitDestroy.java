package ru.nikiforov.testScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.nikiforov.pet.Dog;

/**
 * todo Document type TestInitDestroy
 */

public class TestInitDestroy {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext2.xml");

        Dog myDog = context.getBean("myPet", Dog.class);
        Dog yourDog = context.getBean("myPet", Dog.class);

        myDog.say();
        yourDog.say();

        context.close();
    }
}