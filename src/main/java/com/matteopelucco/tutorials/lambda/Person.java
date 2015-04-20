package com.matteopelucco.tutorials.lambda;

/**
 * Created by matteo on 19/04/2015.
 */
public class Person {

        String firstName;
        String lastName;

        Person() {}

        Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }


    public String toString(){
        return this.firstName + " " + this.lastName;
    }


}
