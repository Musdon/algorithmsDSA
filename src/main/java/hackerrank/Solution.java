package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    static void staircase(int n){

        for (int numSymbols=1; numSymbols<=n; numSymbols++){
            //numSpaces + numSymbols = n
            int numSpaces = n-numSymbols;

            for (int i=0; i<numSpaces; i++){
                System.out.print(' ');
            }
            for (int i=0; i<numSymbols; i++){
                System.out.print('#');
            }
            System.out.println();
        }
    }

    static void stairCase(int n){
        String str = "#";
        for (int i = 0; i < n; i++) {
            System.out.printf("%" + (n) + "s \n", str);
            str += "#";
        }
    }

    static void minMaxSum(List<Integer> arr){
        long minSum;
        long maxSum;
        long totalSum = 0;
        int max = Collections.max(arr);
        int min = Collections.min(arr);

        for (int i=0; i<arr.size(); i++){
            totalSum += arr.get(i);
        }
        minSum = totalSum - max;
        maxSum = totalSum - min;

        System.out.println(minSum + " " + maxSum);

    }

    static void miniMaxSum(List<Integer> arr){
        int min = arr.get(0);
        int max = arr.get(0);
        long totalSum = 0;
        for (int n:arr){
            totalSum += n;
            if (n<min){
                min = n;
            }
            if (n>max){
                max=n;
            }

        }

        System.out.println((totalSum-max) + " " + (totalSum-min));


    }

    public static int birthdayCakeCandles(List<Integer> candles){
        int max = Collections.max(candles);
        int count = 0;
        for (int i=0; i<candles.size(); i++){
            if (candles.get(i) == max){
                count++;
            }
        }
        return count;

    }

    public static String timeConversion(String s) {
        String hourText = s.substring(0,2);
        if (s.endsWith("AM")){
            if ("12".equals(hourText)){
                hourText = "00";
            }
        } else {
            if (!"12".equals(hourText)){
                hourText = String.valueOf(12 + Integer.valueOf(hourText));
            }
        }
        s = hourText + s.substring(2, s.length()-2);
        return s;
    }

    public static void main(String[] args) {
        int  n=6;
        staircase(6);
        stairCase(6);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(7);
        list.add(69);
        list.add(2);
        list.add(221);
        list.add(8974);
        minMaxSum(list);
        miniMaxSum(list);

        ArrayList<Integer> candles = new ArrayList<>();
        candles.add(4);
        candles.add(4);
        candles.add(1);
        candles.add(3);
        System.out.println(birthdayCakeCandles(candles));
        System.out.println(timeConversion("Musa"));
    }


}
