package july_29;
class Car {
    public String name;
    public String brand;
    public String engine;
/*
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setEngine(String engine){
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }
*/
    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public Car(String name, String brand, String engine) {
        this.name = name;
        this.brand = brand;
        this.engine = engine;
    }
}
public class Getter_Setter {
    public static void main(String[] args) {
        Car car = new Car("3","Mazda", "2 litre");
        Car car2 = new Car("3g","Mazda", "2 litre");
        System.out.println(car);
        System.out.println(car2);
    }
}
