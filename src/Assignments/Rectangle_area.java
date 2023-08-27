package Assignments;

class rectangle{
    int length;
    int breadth;

    public int area(){
        return length * breadth;
    }

    public int perimeter(){
        return 2*(length + breadth);
    }
}






public class Rectangle_area {
    public static void main(String[] args) {

        rectangle sides = new rectangle();
        sides.length = 5;
        sides.breadth = 2;

        System.out.println(sides.area());
        System.out.println(sides.perimeter());
    }

}
