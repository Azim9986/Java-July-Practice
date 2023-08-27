package Aug12;

public class Tesla extends Cars{
    @Override
    public void EngineType() {
        System.out.println("Electric Motor");
    }

    @Override
    public void FuelType() {
        System.out.println("Electricity");
    }

    @Override
    public void SeatCapacity() {
        System.out.println('5');
    }
}
