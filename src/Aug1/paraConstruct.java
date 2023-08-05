package Aug1;

class date {
    public int day;
    public int month;
    public int year;
    date(){

    }

    public date(int day) {
        this.day = day;

    }

    public date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;


    }
    public void printDate(){
        System.out.println("Date : " + day + " /" + month + " /"+ year);
    }


}
public class paraConstruct{
    public static void main(String[] args) {
        date date = new date(20,10,2002);
        date.printDate();

        date date1 = new date(3);
        date1.printDate();
    }
}
