package Array_assignments;

public class avg_marks {
    public static void main(String[] args) {
        double[] marks = {12,20,14,6,7,10};

        double sum = 0;
        for (double n:marks) {
            sum = sum + n ;
        }
        System.out.println(sum/ marks.length);
    }
}
