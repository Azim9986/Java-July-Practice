import java.util.Scanner;

public class Problem_01 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a number to check: ");
                int user_input = input.nextInt();
                int b = 30;
        System.out.println(user_input > b);
        float u = 1;
        float v = 2;
        float a = 30;
        float s = 10;
        float k = (v*v -u*u)/(2*a*s);
        System.out.println(k);
    }
}
