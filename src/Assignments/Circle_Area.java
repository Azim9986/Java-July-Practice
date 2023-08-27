package Assignments;

class Circle{
    double rad;

    public double area(){
        return (22f/7f)*(rad)*(rad);
    }

    public double perimeter(){
        return 2*(22f/7)*(rad);
    }
}


public class Circle_Area {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.rad = 5;

        System.out.println(Math.round(circle.area()*100.0)/100.0);

        System.out.println(Math.round(circle.perimeter()*100.0)/100.0);
    }
}
