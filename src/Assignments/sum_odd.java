package Assignments;

public class sum_odd {
    public static void main(String[] args) {
        System.out.println("Sum of odd numbers");
        int i = 0;
        int n = 10;
        int sum = 0;
        int num = 1;
        while(i<n){
            if (num%2 !=0){
                sum+= num;
                i++;
            }
            num++;

        }
        System.out.println(sum);
    }
}
