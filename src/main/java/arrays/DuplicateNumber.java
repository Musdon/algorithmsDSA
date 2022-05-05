package arrays;

import java.util.*;
import java.util.stream.Stream;

public class DuplicateNumber {
    
    public static int[] removeDuplicatesUsingSorting(int[] arr){
        Arrays.sort(arr);
        int length = arr.length-1;
        int j=0;
        int k=0;
        for (int i=0; i<length; i++){
            if (arr[i] != arr[i+j]){
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[length-1];
        for (k=0; k<j; k++){
            return new int[]{arr[k]};
        }

        return new int[]{arr[k]};

    }

    public static Integer[] letsRemoveDuplicates(int[] arr){
        int i=0;
        Set<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        for (i=0; i< arr.length; i++){
            set.add(arr[i]);
        }


        Integer[] result = set.stream().toArray(Integer[] ::new);
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,1,2,2,3,4,5};

        System.out.println(Arrays.toString(letsRemoveDuplicates(array)));

    }
}
