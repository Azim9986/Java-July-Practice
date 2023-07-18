package Assignments;

import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        System.out.println("Enter a number to find the cube");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int cube = i*i*i;
        System.out.println(cube);
    }
}
