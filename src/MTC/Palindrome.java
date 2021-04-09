package MTC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrome {

    public Boolean checkPalindrome (String string) {
        if(string=="") {
            return false;
        }
        List<String> fromString = Arrays.asList(string.replaceAll("[\\/()'^\"№`~|{}\\[\\].,@&#*!%:-\\\\s]", "").split(""));
        fromString.forEach(System.out::println);
        List<String> copy = new ArrayList<>(fromString);
        Collections.reverse(copy);
        if (String.join("", fromString).equalsIgnoreCase(String.join("", copy))){
            return true;
        }
        return false;
    }
}
