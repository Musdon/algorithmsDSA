package crackingTheCodingInterview;

import java.util.Map;

public class OneAway {

    public static boolean edits(String str1, String str2){

        return true;
    }

    private static Map<String, Integer> breakDownStringToChars(Map<String, Integer> map, String string){
        for (int i=0; i<string.length(); i++){
            String character = Character.toString(string.charAt(i));
            if (map.containsKey(character)){
                map.put(character, map.get(character)+1);
            }
            else {
                map.put(character, 1);
            }
        }
        return  map;
    }
}
