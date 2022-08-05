package crackingTheCodingInterview;

public class IsUnique {

    public static boolean isUniqueChars(String str) {
        if (str.length() > 128){
            return false;
        }
        boolean[] charSet = new boolean[128];
        for (int i=0; i<str.length(); i++){
            if (!charSet[str.charAt(i)]){
                charSet[str.charAt(i)] = true;
            } else{
                return false;
            }
        }

        return true;

    }

    public static boolean isUniqueMySolution(String str){
        if (str.length()<=1){
            return true;
        }
        for (int i=0; i<str.length(); i++){
            char currentChar = str.charAt(i);
            int index = str.substring(i+1).indexOf(currentChar);
            if (index != -1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueMySolution(word));
        }
    }
}
