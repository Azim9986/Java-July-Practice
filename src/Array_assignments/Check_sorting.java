package Array_assignments;

public class Check_sorting {
    public static void main(String[] args) {
        int[] num = {1,21,23,25,40};
        boolean isSorted = true;
        for (int i = 0; i < num.length - 1; i++) {
          if ( num[i]<num[i+1]){
              isSorted = true;
          }
          else {
              isSorted = false;
          }

        }
        if (isSorted){
            System.out.println("The array is sorted.");
        }
        else {
            System.out.println("The array is not sorted");
        }
    }
}
