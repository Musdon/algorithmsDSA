package crackingTheCodingInterview;

import java.util.Arrays;

public class Permutation {

    String sort(String s){
        char[]content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }

    public boolean checkPermutation(String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    public static void main(String[] args) {
        Permutation permutation = new Permutation();
        System.out.println(permutation.sort("god"));
        System.out.println(permutation.checkPermutation("grab", "brag"));
    }
}
