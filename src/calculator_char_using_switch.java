import java.util.Scanner;

public class calculator_char_using_switch {
    public static void main(String[] args) {
        System.out.println("This is a Calculator.");
        System.out.println("Enter + for addition.\nEnter - for subtraction.\nEnter * for multiplication.\nEnter / for division.\nEnter % for modulus.");
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number 1");
        int number_1 = sc.nextInt();

        System.out.println("Enter number 2");
        int number_2 = sc.nextInt();

        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+' -> {
                System.out.println("The addition of number 1 and 2 is: ");
                System.out.println(number_1 + number_2);
            }
            case '-' -> {
                System.out.println("The subtraction of number 1 from 2 is: ");
                System.out.println(number_2 - number_1);
            }
            case '*' -> {
                System.out.println("The multiplication of number 1 and 2 is: ");
                System.out.println(number_1 * number_2);
            }
            case '/' -> {
                System.out.println("The division of number 1 by 2 is: ");
                System.out.println(number_1 / number_2);
            }
            case '%' -> {
                System.out.println("The modulus of number 1 and 2 is: ");
                System.out.println(number_1 % number_2);
            }
            default -> System.err.println("Please enter valid input.");
        }
    }

}
