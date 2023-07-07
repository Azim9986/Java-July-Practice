public class Largest_number {
    public static void main(String[] args) {
     int x = 12;
     int y = 14;
     int z = 11;

     if (x>y && x>z) {
         System.out.println("x is greater with value: " +x);
     }
     else if (y>x && y>z){
         System.out.println("y is the largest with value: " + y);
     } else if (z>x && z>y) {
         System.out.println("z is the largest with value: " +z);
     }
    }
}
