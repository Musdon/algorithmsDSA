package leetcode;

import java.util.HashMap;

public class characterCount {

    private static void charCount(String inputString){

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        //convert string to char array
        char[] strArray = inputString.toCharArray();
        //traverse through the array
        for (char c : strArray){
            if (characterIntegerHashMap.containsKey(c)){
                //if c is present in the hashmap, increment count by1
                characterIntegerHashMap.put(c, characterIntegerHashMap.get(c)+1);

            }
            else {
                //put c in the map with its count as 1
                characterIntegerHashMap.put(c, 1);
            }

        }
        System.out.println(inputString+" : " +characterIntegerHashMap);
        String s = "a19662cfa46d7f534569d77caea05f07256083b2958f62ad97bcb395f92f9a1f570207f3510a21cacc21620de238266543abfd30982de2440cbabd3a20e54c01";
        System.out.println(s.length());

    }

    public static void main(String[] args) {
        charCount("Java J2EE Java JSP J2EE");
        int k = 1;
        int i = ++k + k++ + + k;
        System.out.println(i);
        System.out.println(1/2 + 3/2 + 0.1);
        int a, b, c;
        b = 10;
        a = b = c = 20;
        System.out.println(a);

    }
}
