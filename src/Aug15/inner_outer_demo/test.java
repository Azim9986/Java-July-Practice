package Aug15.inner_outer_demo;

public class test {
    public static void main(String[] args) {

    Outerclass out = new Outerclass();
    out.outermethod();
    Outerclass.Innerclass inner = out.new Innerclass();
    inner.innermethod();
    inner.x = 12;


    }
}
