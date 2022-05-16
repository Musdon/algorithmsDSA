package arrays;

import java.lang.reflect.Method;
import java.util.stream.Collectors;

public class PairSum {

    public static String pairSum(int[] myArray, int sum){
        String result = "";
        for (int i=0; i<myArray.length; i++){
            for (int j=i+1; j<myArray.length; j++){
                if (myArray[i]+myArray[j]==sum){
                    result+= myArray[i]+":"+myArray[j] + " ";
                }
            }
        }
        return result;
    }

    public static String pairSumUsingWhileLoop(int[] array, int sum){
        String result ="";
        int i=0;
        int j= array.length-1;
        while (i<j){
            if (array[i] + array[j] == sum){
                result += array[i] + ":" + array[j];
                i++;
                j--;
            }
            i++;
            j--;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] myArray = {2,4,3,5,6,-2,4,7,8,9};
        //System.out.println(pairSum(myArray, 7));
        System.out.println(pairSumUsingWhileLoop(myArray, 7));
        PairSum p = new PairSum();
        Class c1 = p.getClass();
        System.out.println(c1.getName());

        Method m[] = c1.getDeclaredMethods();
        for (Method method: m){
            System.out.println(method.getName());
        }
    }


}
