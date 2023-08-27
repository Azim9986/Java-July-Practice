package Assignments;


class mobile{
    public void getTime(){
        System.out.println("Time is 10 am.");
    }
    public void name(){
        System.out.println("NOKIA...!");
    }
}
class smartphone extends mobile{
    public void music(){
        System.out.println("Playing music.");
    }
    public void name(){
        System.out.println("Iphone...!");
    }
}
public class Dynamic_Disptach {
    public static void main(String[] args) {
        mobile sc = new smartphone();
        sc.getTime();
        sc.name();
//        sc.music(); THIS WON'T WORK AS IT IS FROM THE CHILD CLASS.
    }
}

