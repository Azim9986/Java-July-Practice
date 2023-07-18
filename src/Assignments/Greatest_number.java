package Assignments;

import java.util.Scanner;

public class Greatest_number {
    public static void main(String[] args) {
        System.out.println("Checking the greatest number");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        System.out.println("Enter the third number");
        int z = sc.nextInt();


        if (x>y && x>z){
            System.out.println(x + " is greater than " + y + " and " + z);
        } else if (y>x && y>z) {
            System.out.println(y + " is greater than " + x + " and " + z);
        } else if (z>x && z>y) {
            System.out.println(z + " is greater than " + y + " and " + x);
        } else if (x==y && y ==z) {
            System.out.println(x + " is equal to " + y + " and " + z);
        }else if (x==z) {
            System.out.println(x +" is equal to " + z);
        } else if (x==y) {
            System.out.println(x + " is equal to " + y);
        } else if (y==z) {
            System.out.println(y + " is equal to " + z);
        } else{
            System.out.println(" Invalid. ");
        }

    }
}
