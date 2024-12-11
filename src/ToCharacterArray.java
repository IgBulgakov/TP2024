package bulgakov;

import java.util.ArrayList;

public class ToCharacterArray {
    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> charList = new ArrayList<>();
        for (char c : s.toCharArray()) {
            charList.add(c);
        }
        return charList;
    }
}
