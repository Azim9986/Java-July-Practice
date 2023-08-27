package Assignments;

public class reverse_star {
    static void star(int n){
        for (int i = n; i > 0 ; i--) {
            for (int j = 0; j < i -1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    star(5);
    }
}
