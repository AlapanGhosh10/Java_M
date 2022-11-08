package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 1000;
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        System.out.println("The maximum value of integer is: " + max);
        System.out.println("The minimum value of integer is: " + min);
        System.out.println("Overflow: " + (max+1));
        System.out.println("Underflow: " + (min-1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Max: " + myMaxByteValue);
        System.out.println("Byte Min: " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Max: " + myMaxShortValue);
        System.out.println("Short Min: " + myMinShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Max: " + myMaxLongValue);
        System.out.println("Long Min: " + myMinLongValue);

        int myNewInt = (max / 2);
        byte MyNewByte = (byte)(myMinByteValue / 2);

        byte n1 = 10;
        short n2 = 20;
        int n3 = 30;
        long n4 = 50000L + 10L * (n1 + n2 + n3);
        System.out.println(n4);
    }
}
