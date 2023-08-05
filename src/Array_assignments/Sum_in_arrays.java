package Array_assignments;

public class Sum_in_arrays {
    public static void main(String[] args) {
        float[] number = {12.3f,45.2f,56.8f,10.5f, 10.0f};
        float sum = 0f;
        for (int i = 0; i < number.length; i++) {
            sum = sum +number[i];
        }
        System.out.println(sum);
    }
}
