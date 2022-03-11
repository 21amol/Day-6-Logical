package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumber {

    public void primeNumber() {

        int n;
        int i;
        int divisor = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            if (n % i == 0) {
            //    System.out.println(i);
                divisor = i + divisor;
            }
        }
            if (divisor == (n + 1)) {
                System.out.println(n + " is a prime number");

            } else {
                System.out.println(n + " is not a prime number");
            }
        }


    public static void main(String[] args) {
        // Welcome to the Prime Number Program.
        PrimeNumber pn = new PrimeNumber();
        pn.primeNumber();
    }
}
