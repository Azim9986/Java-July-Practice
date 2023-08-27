package Aug15.inner_outer_demo;

public class Outerclass {
    String name = "Azim";
        public static void outermethod(){
            System.out.println("This is Outer Method");
        }
        class Innerclass{
            int x = 99;
            public static void innermethod(){
                System.out.println("This is Inner Method");
            }
        }
}
