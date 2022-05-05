package arrays;

import java.util.Arrays;

public class MiddleFunction {
    public static int[] middle(int[] arr){
        int [] newArray = new int [arr.length-2];
        for (int i =1; i<= arr.length-2; i++){
            newArray[i-1] = arr[i];
        }
        return newArray;
    }

    public static int[] middle2(int[] arr){
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50, 60};
        System.out.println(Arrays.toString(middle(array)));
        System.out.println(Arrays.toString(middle2(array)));
    }
}
