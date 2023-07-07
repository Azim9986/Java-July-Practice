public class inc_dec {
    public static void main (String[] args){
        int x = 10;
        int y = 25;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x);
        System.out.println(y);
    }
}
