package Assignments;

import java.util.Scanner;

public class alphabet {
    public static void main(String[] args) {
        System.out.println("Checking the letter if it is consonant or vowel.");
        System.out.println("Enter the alphabet");
        Scanner sc = new Scanner(System.in);
        char input = Character.toLowerCase(sc.next().charAt(0));

        if (input == 'a' || input == 'e' || input == 'i' || input == 'o'|| input == 'u'){
            System.out.println(input  + " is a vowel.");
        }else {
            System.out.println(input + "is a consonant.");
        }
    }
}
