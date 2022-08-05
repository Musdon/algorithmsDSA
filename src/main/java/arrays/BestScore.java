package arrays;

import java.util.Arrays;
import java.util.Collections;

public class BestScore {

    public static String firstSecondScore(Integer [] myArray){
        Integer[] arr = myArray;
        Arrays.sort(arr, Collections.reverseOrder());
        int first = arr[0];
        int second = arr[1];
        return first + " " + second;

    }

    public static void main(String[] args) {
        Integer[] myArray = {84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        System.out.println(firstSecondScore(myArray));
    }
}
