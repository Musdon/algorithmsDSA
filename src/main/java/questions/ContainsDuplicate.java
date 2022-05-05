package questions;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums){
        HashSet<Integer> numbers = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            if (numbers.contains(nums[i])){
                return true;
            }
            numbers.add(nums[i]);

        }
        return false;
    }

    public boolean containsDuplicateSort(int[] nums){
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            if (nums[i] == nums[i+1]){
                return true;
            }

        }
        return false;
    }

    public boolean containsDuplicateBruteForce(int[] nums){
        for (int i=0; i< nums.length; i++){
            for (int j=i+1; j< nums.length; j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
