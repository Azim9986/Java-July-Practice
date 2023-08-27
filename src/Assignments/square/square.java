package Assignments.square;

public class square {
    int side;

    public void setS(int y) {
        side = y;
    }
    public int CalculateArea(){
        return side * side;
    }
    public int Perimeter() {
        return  4* side;
    }
}
