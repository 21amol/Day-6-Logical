package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Welcome to reverse number program.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i;
        int remainder = 1;

        for (i = 1; remainder > 0 && num > 0; i++) {
            remainder = (num % 10);
            num = (num / 10);
            System.out.print(remainder);
        }
    }
}
