package Assignments;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args) {
        System.out.println("Enter a number for the range");
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int n = sc.nextInt();
        while (i<=n){

            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
