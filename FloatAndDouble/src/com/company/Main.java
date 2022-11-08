package com.company;

public class Main {

    public static void main(String[] args) {
        int myInt = 5 / 2;

        float myFloat = 5f / 3f;
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float max: " + myMaxFloatValue);
        System.out.println("Float min: " + myMinFloatValue);

        double myDouble = 5d / 3d;
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double max: " + myMaxDoubleValue);
        System.out.println("Double min: " + myMinDoubleValue);

        System.out.println("My int: " + myInt);
        System.out.println("My float: " + myFloat);
        System.out.println("My double: " + myDouble);

        double inPounds = 200d;
        double inKilos = inPounds * 0.45359237d;
        System.out.println("The weight in kilograms is: " + inKilos + "kgs");
    }
}
