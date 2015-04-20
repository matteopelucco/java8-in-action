package com.matteopelucco.tutorials.lambda;

/**
 * Created by matteo on 19/04/2015.
 */
@FunctionalInterface
public interface Converter<F, T> {

    T convert(F from);

    default String getName(){
        return "Convert something into something else";
    }


}
