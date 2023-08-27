package Aug15.inner_outer_demo;

public class Exceptional_handling {
    public static void main(String[] args) {
        String name = "Azim";
        name  = null;
        int x = 9;
        try{
        System.out.println(name.toLowerCase());
            System.out.println(x/0);
        System.out.println(name.trim());
    }
        catch (NullPointerException e){
            System.out.println("Error");
        }
}}
