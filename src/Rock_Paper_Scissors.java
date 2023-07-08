import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("This is a Rock, Paper, Scissors Game!!");
        System.out.println("Enter your choice: 1 for Rock, 2 for Paper or 3 for Scissors.");

        Random guess = new Random();
        int system_input = guess.nextInt(4);
        System.out.println(system_input);

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();
        if (user == 1 && system_input ==1){
            System.out.println("tie");
        }
        else if (user == 2 && system_input ==1) {
            System.out.println("You won");
        } else if (user == 3 && system_input ==1) {
            System.out.println("You lost");
        } else if (user == 1 && system_input ==2){
            System.out.println("Lost");
        }
        else if (user == 2 && system_input ==2) {
            System.out.println("Tie");
        } else if (user == 3 && system_input ==2) {
            System.out.println("Won");
        } else if (user == 1 && system_input ==3){
            System.out.println("Won");
        }
        else if (user == 2 && system_input ==3) {
            System.out.println("Lost");
        } else if (user == 3 && system_input ==3) {
            System.out.println("Tie");
        } else {
            System.out.println("there is an error");
        }


    }
}
