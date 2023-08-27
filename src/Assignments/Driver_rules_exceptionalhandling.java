package Assignments;

public class Driver_rules_exceptionalhandling {
    int age;
    String name;
    public int drive(int age) throws AgeLimitException{
        if(age< 18){
            throw new AgeLimitException("You are under age");
        }
        return age;
    }

//    public int age(int i) {
//
//    }
}
