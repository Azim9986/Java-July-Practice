package Assignments;

import java.util.Scanner;

public class calculator_Functionality {
    public static void main(String[] args) {
        System.out.println("Enter the numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println(num1);
        int num2 = sc.nextInt();

        System.out.println(num2);
        System.out.println(Calculator_method.divide(num1, num2));}
    }

