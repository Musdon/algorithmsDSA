package leetcode;

import java.util.List;

public class ReverseString {

    public void reverseString(char[] s) {
        int aPointer = 0;
        int bPointer = s.length-1;
        while (aPointer <= bPointer){
            char temp = s[aPointer];
            s[aPointer] = s[bPointer];
            s[bPointer] = temp;

            aPointer+=1;
            bPointer-=1;
        }
    }

    public boolean detectCapital(String word){
        int count = 0;
        for (int i=0; i<word.length(); i++){
            if (Character.isUpperCase(word.charAt(i))){
                count++;
            }
        }
        return count == word.length() || count == 0 || count ==1 && Character.isUpperCase(word.charAt(0));
    }

    public String reverseWords(String s){
        if (s==null || s.length() == 0){
            return s;
        }
        StringBuilder result = new StringBuilder();
        String[] splitWords = s.split(" ");
        for (String word: splitWords){
            StringBuilder wordSb = new StringBuilder();
            wordSb.append(word);
            wordSb.reverse();
            result.append(wordSb.toString() + " ");
        }
        result.setLength(result.length() -1);
        return result.toString();
    }

    public static boolean getResult(List<Integer> fences) {
        // Write your code here...
        int size = fences.size()-1;

        for(int i=0; i<fences.size(); i++){
            if( fences.get(i) <= fences.get(size)){
                return true;
            } else{
                return false;
            }

        }
        return false;

    }

    public boolean isPalindrome(String s){
        String fixedString = "";
        for (char c : s.toCharArray()){
            if (Character.isDigit(c) || Character.isLetter(c)){
                fixedString += c;
            }
        }
        fixedString = fixedString.toString().toLowerCase();
        int aPointer = 0;
        int bPointer = fixedString.length()-1;
        while (aPointer <= bPointer){
            if (fixedString.charAt(aPointer) != fixedString.charAt(bPointer)){
                return false;
            }
            aPointer += 1;
            bPointer -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.detectCapital("USA"));

    }




}
