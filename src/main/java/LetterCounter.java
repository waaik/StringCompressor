import java.util.Arrays;
import java.util.Locale;

public class LetterCounter {

    public static void main(String[] args) {
        String s = "aaaagggvvvcdsssww";

        letterCounter(s.toLowerCase());


    }

    public static void letterCounter(String s) {
        String newString = "";
        int count = 0;
        char val = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == val) {
                count++;
            }else{
                newString += val + Integer.toString(count);
                val = s.charAt(i);
                count =1;
            }
        } newString += val + Integer.toString(count);
        if (newString.length() > s.length()){
            System.out.println(s);
        }

        System.out.println(newString);
    }



}



