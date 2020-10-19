package InterviewPrep.DictionariesAndHashmaps;

import java.util.HashMap;

public class TwoStrings {

    static String twoStrings(String s1, String s2) {

        String answer = "NO";

        // Create hashmap of String 1
        HashMap<Character, Boolean> map = new HashMap<>();
        for(char c : s1.toCharArray()) {
            map.put(c, true);
        }

        // Check chars of String 2 to see if a substring can be found in the map
        for(char c : s2.toCharArray()) {
            if (map.containsKey(c)) {
                answer = "YES";
            }
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
