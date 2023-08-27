package Assignments;


class Construct{
    int id;
    String name;

    public Construct(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class Constructor_practice {
    public static void main(String[] args) {
        Construct first = new Construct(101,"Azim");
        System.out.println(first.id);
        System.out.println(first.name);

    }
}
