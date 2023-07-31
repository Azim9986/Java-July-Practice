package Arrays;

import java.util.Scanner;

public class Strin_input {
    public static void main(String[] args) {
        String car[] = new String[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Car name: ");

        for (int i = 0; i < car.length; i++) {
            car[i] = sc.nextLine();

        }
        // Printing values with for loop.
//        for (int i = 0; i < car.length; i++) {
//            System.out.println(car[i]);
//        }
        //Printing values with for each.
        for (String n: car) {
            System.out.println(n);
        }
    }
}
