package Assignments;

import java.util.Scanner;

public class Multiplication_Method {
    static void multiplication(int n){
        for (int i = 1; i <= 10; i++) {
            System.out.println(n +" x " + i + " = " + (n*i));
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number to print the table: ");
        int x = sc.nextInt();
        multiplication(x);
    }
}
