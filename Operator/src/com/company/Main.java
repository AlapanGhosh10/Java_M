package com.company;

public class Main {

    public static void main(String[] args) {
        int resul = 1 + 2;
        System.out.println("1 + 2 = " + resul);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore != 100) {
            System.out.println("Not top score");
        }

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("was car is true");

        // Operator Challenge
        double n1 = 20.00d;
        double n2 = 80.00d;
        double result = (n1 + n2) * 100.00d;
        double remainder = result % 40.00d;
        boolean isZero = remainder == 0 ? true : false;
        System.out.println("The boolean result is: " + isZero);
        if( !isZero )
            System.out.println("Got some remainder");
    }
}
