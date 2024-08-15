package CountCharactersInYourString;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static void main(String[] args) {
        System.out.println(count("abab"));
    }

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
