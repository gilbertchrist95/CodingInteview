package Hackerank.DictAndHashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockAnagram {

    static int sherlockAndAnagrams(String s) {
        int totalCount = 0;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length() + 1; j++) {
                String substring = s.substring(i, j);
                char c[] = substring.toCharArray();
                Arrays.sort(c);
                String sortedSubString = String.valueOf(c);
                if (map.containsKey(sortedSubString)) {
                    totalCount += map.get(sortedSubString);
                    map.put(sortedSubString, map.get(sortedSubString) + 1);
                } else {
                    map.put(sortedSubString, 1);
                }
            }
        }
        return totalCount;
    }

    public static void main(String args[]) {
        String s = "cdcd";
        System.out.println(sherlockAndAnagrams(s));
    }

}
