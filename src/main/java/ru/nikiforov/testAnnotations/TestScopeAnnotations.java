package ru.nikiforov.testAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.nikiforov.pet.Dog;

/**
 * todo Document type TestScopeAnnotations
 */

public class TestScopeAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext3.xml");

        Dog myDog = context.getBean("dog", Dog.class);
        Dog yourDog = context.getBean("dog", Dog.class);

        myDog.setName("Belka");
        yourDog.setName("Strelka");

        System.out.println(myDog.getName());
        System.out.println(yourDog.getName());

        System.out.println("Переменные ссылаются на один и тот же объект? " + (myDog == yourDog));

        System.out.println(myDog);
        System.out.println(yourDog);

        context.close();
    }
}