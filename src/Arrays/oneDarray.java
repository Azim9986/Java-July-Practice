package Arrays;

import java.util.Scanner;

public class oneDarray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);


        for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
        }
            for (int n: arr) {
                System.out.println(n);}
            }

    }

