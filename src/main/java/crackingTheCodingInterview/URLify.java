package crackingTheCodingInterview;

import java.util.Arrays;

public class URLify {

    public String urlify(String str){
        return str.replaceAll(" ", "%20");
    }

    public String urlifyCharArray(String str){
        char [] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++){
            sb.append(chars[i]);
            if (chars[i] == ' '){
                sb.append("%20");
            }
        }
        return sb.toString().replaceAll(" ", "");
    }

    public static void main(String[] args) {
        URLify url = new URLify();
        System.out.println(url.urlify("Mr John Smith "));
        System.out.println(url.urlifyCharArray("Mr John Smith "));
    }
}
