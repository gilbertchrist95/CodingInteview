package Hackerank.DictAndHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {
    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : magazine) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }

        boolean x = solve(note, map);
        System.out.println(x ? "Yes":"No");

    }

    private static boolean solve(String[] note, Map<String, Integer> map) {
        for (String s : note) {
            if (map.containsKey(s)) {
                int value = map.get(s);
                if (value > 0) {
                    map.put(s, map.get(s) - 1);
                } else {
                    return false;
                }
            } else {
               return false;
            }
        }

       return true;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        String[] mn = scanner.nextLine().split(" ");

//        int m = Integer.parseInt(mn[0]);
//
//        int n = Integer.parseInt(mn[1]);
//
//        String[] magazine = new String[m];
//
        String[] magazine = "ive got a lovely bunch of coconuts".split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < m; i++) {
//            String magazineItem = magazineItems[i];
//            magazine[i] = magazineItem;
//        }

        String[] note = "ive got some coconuts".split(" ");

//        String[] noteItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        for (int i = 0; i < n; i++) {
//            String noteItem = noteItems[i];
//            note[i] = noteItem;
//        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
