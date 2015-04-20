package com.matteopelucco.tutorials;

/**
 * Created by matteo on 19/04/2015.
 */
public class FormulaMain {

    public static void main(String[] args) {


        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 100);
            }
        };

        System.out.println(formula.calculate(100));     // 100.0
        System.out.println(formula.sqrt(16));           // 4.0
    }

}
