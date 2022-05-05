package arrays;

import java.util.Arrays;

public class Permutation {

    public boolean permutation(int[] array1, int[] array2){
        int sum1 =0; int sum2 = 0;

        int product1=1; int product2 = 1;
        if (array1.length != array2.length){
            return false;
        }
        for (int i=0; i<array1.length; i++){
            sum1 += array1[i];
            sum2 += array2[i];
            product1 *= array1[i];
            product2 *= array2[i];
        }
        if (sum1 == sum2 && product1 == product2){
            return true;
        }
        return false;
    }
}
