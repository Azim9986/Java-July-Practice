package Assignments;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName( String n){
        name = n;
    }

}

public class Practice_classes_methods {
    public static void main(String[] args) {
        Employee Azim = new Employee();
        Azim.setName("Azim Memon");
        System.out.println(Azim.getName());
        Azim.salary = 100;
        System.out.println(Azim.getSalary());
    }
}
