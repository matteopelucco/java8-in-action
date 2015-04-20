package com.matteopelucco.tutorials.lambda;

/**
 * Created by matteo on 19/04/2015.
 */
public class ConverterMain {

    public static void main(String[] args) {

        Converter<String, Integer> converter = (from) -> Integer.valueOf(from);

        Integer converted = converter.convert("123");

        System.out.println(converter.getName());
        System.out.println(converted);


        // going further.. reference to static methods
        Converter<String, Integer> converterRef = Integer::valueOf;

        Integer convertedRef = converterRef.convert("123");

        System.out.println(converterRef.getName());
        System.out.println(convertedRef);

        // .. reference to object methods
        Something something = new Something();
        Converter<String, String> converterObj = something::startsWith;
        String convertedObj = converterObj.convert("Java8");

        System.out.println(converterObj.getName());
        System.out.println(convertedObj);


    }

}
