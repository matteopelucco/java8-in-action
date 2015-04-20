package com.matteopelucco.tutorials;

/**
 * Created by matteo on 19/04/2015.
 */
public interface Formula {

    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
