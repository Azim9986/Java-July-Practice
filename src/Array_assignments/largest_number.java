package Array_assignments;

public class largest_number {
    public static void main(String[] args) {
        int numbers[] = {1,2,6,7,80,45};
        int largest = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest){
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
