package arrays;

public class MissingNumber {

    public static int missingNumber(int[] arr, int totalCount){
        int expectedSum = 0;
        int actualSum = 0;
        for (int i=0; i<=totalCount; i++){
            expectedSum += i;
        }
        for (int i=0; i<arr.length; i++){
            actualSum += arr[i];
        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,6};
        System.out.println(missingNumber(myArray, 6));
    }
}
