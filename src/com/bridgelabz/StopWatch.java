package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        // Welcome to stop watch program.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of laps: ");
        int laps = sc.nextInt();

        System.out.println("Watch will start from 0.00");

        double start = 0;
        double elapsedTime;
        double totalElapsedTime = 0;
        int i = 1;

        while (i <= laps) {
            System.out.println("Enter the end time: ");
            double end = sc.nextDouble();
            if (end < start) {
                System.out.println("New end time should be greater then previous end time.");
            } else {
                elapsedTime = end - start;
                totalElapsedTime = totalElapsedTime + elapsedTime;
                System.out.println("Elapsed Time is: " + elapsedTime);
                start = end;
                i++;
            }

        }
        System.out.println("Elapsed time between End and Start is: " + totalElapsedTime);
    }
}