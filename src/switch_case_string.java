import java.util.Scanner;

public class switch_case_string {
    public static void main(String[] args) {
        System.out.println("Example for string switch case");
        Scanner sc = new Scanner(System.in);
        String name = sc.next().toLowerCase();


        switch (name){
            case "pragra":
                System.out.println("You entered Pragra");
                break;
            case "cn_tower":
                System.out.println("You entered CN Tower");
                break;


        }
    }
}
