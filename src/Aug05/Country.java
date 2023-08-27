package Aug05;

class India extends Object{
     String name;
     int no_of_States;

     public India(String name, int no_of_States) {
         this.name = name;
         this.no_of_States = no_of_States;
     }

     public void show(){
          System.out.println("Name :" + this.name);
          System.out.println("States :" + this.no_of_States);
     }
}
class City extends India{
     String name;
     int sectors;

    public City(String name, int sectors, int no_of_States) {
        super(name, no_of_States);
        this.name = name;
        this.sectors = sectors;
    }

    public void show1() {
          System.out.println("Name: " + name);
          System.out.println("Sectors :" + sectors);
     }
}
public class Country{
     public static void main(String[] args) {
         City city = new City("India",12, 26);
         City city2 = new City("Ga",12, 26);

         city.show1();
          city.show();

          city2.show();
          city2.show1();
     }
}

