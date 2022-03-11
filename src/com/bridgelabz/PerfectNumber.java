package com.bridgelabz;

import java.util.Scanner;

public class PerfectNumber {

    static int divisor = 0;
    static int i;
    static int x;

    public static void perfectNumber() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        x = sc.nextInt();

        for (i = 1; i < x; i++) {
            if (x % i == 0) {             // checking for divisors.
                //   System.out.println(i);
                divisor = i + divisor;// adding all the divisors.
            }
        }
        System.out.println("Addition of all divisors " + divisor);
    }

    public static void main(String[] args) {
        // Welcome to perfect number program.
        // Perfect number is a number if mentioned number = sum of all divisors.
        perfectNumber();

        if (x == divisor) {
            System.out.println(x + " is a perfect number");
        } else {
            System.out.println(x + " is not a perfect number");
        }
    }
}
