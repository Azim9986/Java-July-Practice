import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("This is a Calculator.");
        System.out.println("Enter 1 for addition.\nEnter 2 for subtraction.\nEnter 3 for multiplication.\nEnter 4 for division.\nEnter 5 for modulus.");
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        System.out.println("Enter number 1");
        int number_1 = sc.nextInt();

        System.out.println("Enter number 2");
        int number_2 = sc.nextInt();


        if (operation == 1) {
            System.out.println("The addition of number 1 and 2 is: " + (number_1 + number_2));

        } else if (operation == 2) {
            System.out.println("The subtraction of number 1 from 2 is: " + (number_2 - number_1));

        } else if (operation == 3) {
            System.out.println("The Multiplication of number 1 and 2 is: " + (number_1 * number_2));

        } else if (operation == 4) {
            System.out.println("The division of number 1 by 2 is: " + (number_1 / number_2));

        } else if (operation == 5) {
            System.out.println("The modulus of number 1 and 2 is: " + (number_1 % number_2));

        } else {
            System.out.println("Enter a valid input.");
        }

    }

}