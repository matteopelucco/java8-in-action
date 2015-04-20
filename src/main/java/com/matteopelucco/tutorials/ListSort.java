package com.matteopelucco.tutorials;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by matteo on 19/04/2015.
 */
public class ListSort {

    public static void main(String[] args) {


        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

        System.out.println(names);

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        System.out.println(names);
        Collections.reverse(names);

        // lambda (readable, java7-like)

        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });


        // one line body
        Collections.sort(names, (String a, String b) -> b.compareTo(a));

        // compiler infers types
        Collections.sort(names, (a, b) -> b.compareTo(a));


        System.out.println(names);

    }

}
