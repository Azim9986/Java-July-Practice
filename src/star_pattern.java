public class star_pattern {
    public static void main(String[] args) {
//        System.out.println("Printing Star Patter");
//        int n = 4;
//        for(int i = n; i>0; i--){
//            for (int j = 0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        //Sum of first n  even numbers
//        int i = 10;
//        while(i>0){
//            System.out.println("10 x " + i + " = " + (10*i));
//            i--;
//        }
//
//        }
        // Factorial using while loop
//        int i = 1;
//        int factorial = 1;
//        while (i<=5){
//            factorial = factorial*i;
//            i++;
//
//        }
//        System.out.println(factorial);
        // Factorial using for loop
//        int factorial = 1;
//        for (int i=1; i<=5;i++){
//            factorial *= i;
//
//        }
//        System.out.println(factorial);
        int i = 0;
        int sum = 0;
        while(i<=10){
            sum = sum +(10*i);
//            System.out.println("10 x " + i + " = " + (10*i));

            i++;
        }
        System.out.println(sum);
    }
}

