package ru.nikiforov.testConfigJavaBeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.nikiforov.person.Person;
import ru.nikiforov.pet.Cat;

/**
 * todo Document type ConfigJavaBeans
 */

@Configuration
@ComponentScan("ru.nikiforov")
@PropertySource("myApp.properties")
public class ConfigJavaBeans {

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Person person() {
        return new Person(cat());
    }
}