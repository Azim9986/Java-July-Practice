package Assignments;

public class CalculateArea {
    static  double PI = 3.14;
        double radius;



    public double Area(double radius){
        double area = PI*radius*radius;

        return area;
    }


    public static void main(String[] args) {
        CalculateArea ci = new CalculateArea();
        System.out.println(ci.Area(5.0));
    }
}
