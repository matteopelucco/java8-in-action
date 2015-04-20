package com.matteopelucco.tutorials.lambda;

/**
 * Created by matteo on 19/04/2015.
 */
public interface PersonFactory<P extends Person> {

        P create(String firstName, String lastName);

}
