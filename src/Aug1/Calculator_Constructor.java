package Aug1;

class calculator {
    public int num1;
    public int num2;

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

}

public  class Calculator_Constructor {

    public static void main(String[] args) {
        calculator c = new calculator(5,8);


    }
}