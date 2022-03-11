package com.bridgelabz;

import java.util.Scanner;

public class FibonacciSeries {
    public void fibonacciSeries() {

        int i;
        int n;
        int c = 1;
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nth value till you want the answer: ");
        n = sc.nextInt();

        for (i = 2; i < n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c + " is the answer after Nth number");
    }

    public static void main(String[] args) {
        // Welcome to Fibonacci series program.
        FibonacciSeries fibo = new FibonacciSeries();
        fibo.fibonacciSeries();
    }
}
