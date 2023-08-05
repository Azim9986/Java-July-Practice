package Aug05;

class test{
    String name;
    int id;

    public test(String name, int id) {
        this.name = name;
        this.id = id;
    }
    static void show(){
        test t = new test("Azim", 101);

        System.out.println(t);
    }
}
public class Constructor_private {
    public static void main(String[] args) {
        test.show();
    }
}
