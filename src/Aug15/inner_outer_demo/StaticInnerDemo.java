package Aug15.inner_outer_demo;

class Outer{
    static void outermethod(){
        System.out.println("It is outer method");
    }
    static class inner{
        public void innermethod(){
            System.out.println("It is inner method");
        }
    }
}
public class StaticInnerDemo {
    public static void main(String[] args) {
        Outer.inner in = new Outer.inner();
        in.innermethod();
        Outer.outermethod();
    }
}