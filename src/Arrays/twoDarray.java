package Arrays;

import java.util.Scanner;

public class twoDarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows that you want.");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns that you want");
        int column = sc.nextInt();
        int years[][] = new int[row][column];
        System.out.println("Enter the numbers");
        for (int i = 0; i < years.length; i++) {
            years[i] = new int[]{sc.nextInt()};
        }
        for (int j = 0; j < years.length; j++) {
            years[j] = new int[]{sc.nextInt()};
        }
        for (int k = 0; k < years.length ;k++) {
            System.out.println(years[k]);
        }
    }
}
