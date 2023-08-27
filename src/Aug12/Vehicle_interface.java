package Aug12;

public class Vehicle_interface implements Car_interface, Bike_interface{

    @Override
    public void seats() {
        System.out.println("Any");
    }

    @Override
    public void engine() {
        System.out.println("Any");
    }

    @Override
    public void wheels() {
        System.out.println("Any");
    }

    @Override
    public void company() {
        System.out.println("Any");
    }
}
