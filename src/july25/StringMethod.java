package july25;

public class StringMethod {
    public static void main(String[] args) {
        String s1 = "Pragra       ";
        System.out.println(s1);
        System.out.println(s1.replace("P", "R"));
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.contains("ag"));
        System.out.println(s1.contentEquals("Pragra"));
        System.out.println(s1.substring(2));
        System.out.println(s1.replace("Pr", "Ni"));
        System.out.println(s1.trim());



        int num =12;
        String s =String.valueOf(num);
        System.out.println(s + 10);
    }
}
