import java.util.Scanner;

public class calculator_char {
    public static void main(String[] args) {
        System.out.println("This is a Calculator.");
        System.out.println("Enter + for addition.\nEnter - for subtraction.\nEnter * for multiplication.\nEnter / for division.\nEnter % for modulus.");
        Scanner sc = new Scanner(System.in);
        char operation = sc.next().charAt(0);

        if(operation =='+'){
            System.out.println("Enter number 1");
            int number_1 = sc.nextInt();

            System.out.println("Enter number 2");
            int number_2 = sc.nextInt();

            System.out.println("The addition of number 1 and 2 is: " +( number_1+number_2));
        } else if(operation == '-'){
            System.out.println("Enter number 1");
            int number_1 = sc.nextInt();

            System.out.println("Enter number 2");
            int number_2 = sc.nextInt();

            System.out.println("The subtraction of number 1 from 2 is: " +( number_2-number_1));
        } else if(operation =='*'){
            System.out.println("Enter number 1");
            int number_1 = sc.nextInt();

            System.out.println("Enter number 2");
            int number_2 = sc.nextInt();

            System.out.println("The Multiplication of number 1 and 2 is: " +( number_1*number_2));
        } else if(operation =='/'){
            System.out.println("Enter number 1");
            int number_1 = sc.nextInt();

            System.out.println("Enter number 2");
            int number_2 = sc.nextInt();

            System.out.println("The division of number 1 by 2 is: " +( number_1/number_2));
        } else if(operation =='%'){
            System.out.println("Enter number 1");
            int number_1 = sc.nextInt();

            System.out.println("Enter number 2");
            int number_2 = sc.nextInt();

            System.out.println("The modulus of number 1 and 2 is: " +( number_1%number_2));
        } else{
            System.out.println("Enter a valid input.");
        }
    }
}
