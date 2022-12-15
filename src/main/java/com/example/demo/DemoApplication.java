package com.example.demo;

import com.example.demo.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);

        Person person1 = new Person("Dima", 66);
        Person person2 = new Person("Dimon", 77);
        Person person3 = new Person("Dimons", 88);

        System.out.println(person3.getFirstName());

        person3.setFirstName("Max");

        System.out.println(person3.getFirstName());


    }

}
