package Assignments;


class Cylinder{
    private int radius;
    private int length;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
public class getsetradius {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(4);
        System.out.println(c.getRadius());
        c.setLength(6);
        System.out.println(c.getLength());

    }
}
