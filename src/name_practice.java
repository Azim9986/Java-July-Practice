import java.util.Scanner;

public class name_practice {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your income in lacs : ");
    float income;
        income = sc.nextFloat();
        float tax = 0;
    if (income>2.5 && income<=5.0){
        tax = (float) (0.053*(income - 2.5));

    } else if (income>5.0 && income<=10.0) {
        tax = (float) ((0.2*(income - 5.0)) + (0.05*2.5));

    } else if (income>10.0f) {
        tax = (float) ((0.3*(income - 10.0)) + (0.2* 5.0) +(0.05*2.5));
    }
    else{
        System.out.println("Your income is non-taxable");
    }
        System.out.println(tax);
    }
}