package InterviewPrep.DictionariesAndHashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        if (magazine.length < note.length) {
            System.out.println("No");
            return;
        }

        // create hasmap with words in magazine as the key, and number of times the word appears as the value.
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<magazine.length; i++) {
            if (map.containsKey(magazine[i])) {
                map.put(magazine[i], map.get(magazine[i])+1);
            } else {
                map.put(magazine[i], 1);
            }
        }

        // Check words in note to see if its a key in the hashmap, if so decrement value. If value is 0, print "No" and return
        for (int i=0; i<note.length; i++) {
            if (map.containsKey(note[i]) && map.get(note[i]) > 0) {
                map.put(note[i], map.get(note[i])-1);
            } else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
        return;
    }

    public static void main (String[] args) {

        String[] magazine = new String[]{"Go", "to", "Strategy", "Kill", "tiger", "Bill"};
        String[] note = new String[]{"Go", "Kill", "Kill", "Bill"};

        checkMagazine(magazine, note);
    }
}
