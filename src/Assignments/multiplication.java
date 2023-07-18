package Assignments;

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        System.out.println("This is a multiplication table.");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th number for the table.");
        int n = sc.nextInt();
        int  i = 1;
//        while (i<=10){
//            System.out.println(n + " x " + i + " = " + (i*n));
//            i++;
//        }
//        do {
//            System.out.println(n + " x " + i + " = " + (i*n));
//            i++;
//        } while (i<=10);

        for (;i<=10; i++){
            System.out.println(n + " x " + i + " = " + (i*n));

        }
    }
}
