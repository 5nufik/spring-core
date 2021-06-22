package ru.nikiforov.testConfigJavaBeans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.nikiforov.person.Person;

/**
 * todo Document type TestConfigJavaBeans
 */

public class TestConfigJavaBeans {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigJavaBeans.class);

        Person person = context.getBean("person", Person.class);

        person.callPet();

        person.getPet();

        context.close();
    }
}