package Assignments;

import java.util.Scanner;

public class even_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to to print pragra in the range of 1 to 10: ");
        int num = sc.nextInt();
        for (int i = 0; i <num; i++) {
            System.out.print(i + " ");
            if (i%2 ==0){
                System.out.print( "Pragra");
            }
        }
    }
}
