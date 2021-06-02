package homework ;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Activity42 {
    public static void main(String[] args) {

        Integer [] a = {5, 5, 1, 5, 2, 1, 9, 5, 8};
        System.out.println("Chieu dai ban dau: " + a.length);
        for (int i = 0; i < a.length; i = i + 1) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        Integer[] numbers = new Integer[] {5,5,1,5,2,1,9,5,8};
        List<Integer> listnumbers = Arrays.stream(numbers).distinct().collect(Collectors.toList());
        System.out.println( "Chieu dai luc sau: " + listnumbers.toArray().length);
        int k = 0 ;
        for (;k < listnumbers.toArray().length; k = k + 1 ) {
            System.out.println("a[" + k + "] = " + listnumbers.toArray()[k]);
        }




    }

}










