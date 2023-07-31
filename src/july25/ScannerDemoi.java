package july25;

import java.util.Scanner;

public class ScannerDemoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num = sc.nextInt();

        System.out.println("Enter name.");
        String name = sc.nextLine();
        System.out.println(name);
    }
}
