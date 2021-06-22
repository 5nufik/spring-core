package ru.nikiforov.testCore;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.nikiforov.pet.Pet;

/**
 * todo Document type TestCore1
 */

public class TestCore1 {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        context.close();
    }
}