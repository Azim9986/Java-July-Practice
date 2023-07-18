package Assignments;

import java.util.Scanner;

public class Sum_Average {
    public static void main(String[] args) {
        System.out.println("This is a program for sum and average.");
        System.out.println("Enter 5 numbers.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();


        int sum = a + b + c + d + e;
        float f = sum/5;
        float avg = f/5;
        System.out.println("The sum of the numbers are " + sum);
        System.out.println("The average of the numbers is " + avg);

    }
}
