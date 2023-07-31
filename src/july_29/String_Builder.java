package july_29;

public class String_Builder {
    public static void main(String[] args) {
        String s1 = "pragra";
        String s2 =s1.concat(" Toronto");
        System.out.println(s2);


        StringBuilder sb = new StringBuilder("pragra");
        sb.append(" Toronto");
        System.out.println(sb);
    }
}
