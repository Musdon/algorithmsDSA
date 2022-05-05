package questions;

import java.util.Stack;

public class LengthOfLastWord {

    public int lengthOfLastWord(String s){
        String words[] = s.split(" ");
        return words[s.length()-1].length();
    }

    public String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public String reverseStringUsingStack(String s){
        Stack<String> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            stack.push(String.valueOf(s.charAt(i)));
        }
        return stack.toString();
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        String prefix = strs[0];
        for (int i=1; i<strs.length; i++){
            while (strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }
}
