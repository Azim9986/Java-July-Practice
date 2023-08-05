package Array_assignments;

public class find_number {
    public static void main(String[] args) {
        int[] num = {12,32,65,36,76,9};
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 65){
                System.out.println(i);
                System.out.println(num[i]);
            }
        }
    }
}
