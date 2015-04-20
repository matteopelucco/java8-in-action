package com.matteopelucco.tutorials.lambda;

/**
 * Created by matteo on 19/04/2015.
 */
public class PersonMain {

    public static void main(String[] args) {
        PersonFactory<Person> personFactory = Person::new;
        Person person = personFactory.create("Peter", "Parker");

        System.out.println(person);
    }
}
