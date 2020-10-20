package InterviewPrep.DictionariesAndHashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class SherlockAndAnagrams {

    // Complete the sherlockAndAnagrams function below.
    static int sherlockAndAnagrams(String s) {

        // Initialize hashmap to store chars of s
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                char[] c = s.substring(i, j+1).toCharArray();

                Arrays.sort(c);

                String k = new String(c);

                map.put(k, map.getOrDefault(k, 0) + 1);
            }
        }

        int anagramPairs = 0;
        for (String k : map.keySet()) {
            int v = map.get(k);
            anagramPairs += (v * (v - 1)) / 2;
        }

        return anagramPairs;

    }

    public static void main(String[] args) {

        System.out.println(sherlockAndAnagrams("abba"));

    }
}
