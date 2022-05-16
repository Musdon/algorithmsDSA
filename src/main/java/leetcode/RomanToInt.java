package leetcode;

import java.util.HashMap;

public class RomanToInt {


    public static int getValue(char c) {
        char[] numerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int [] values = {1, 5, 10, 50, 100, 500, 1000};
        int result = 0;
        for (int i=0; i<numerals.length; i++){
            if (c == numerals[i]){
                result = values[i];
                break;
            }

        }
        return result;
    }

    public static int romanToInteger(String s){
        int result = 0;
        String modifiedS = s;
        for (int i=0; i<s.length(); i++){
            int value1 = getValue(s.charAt(i));
            int value2 = getValue(s.charAt(i+1));
            if (value1 < value2){
                result += (value2-value1);
                modifiedS = modifiedS.replace(s.substring(i, i+2), "");
            }
        }

        for (int i=0; i<modifiedS.length(); i++){
            result +=getValue(modifiedS.charAt(i));
        }
        return result;
    }
}
