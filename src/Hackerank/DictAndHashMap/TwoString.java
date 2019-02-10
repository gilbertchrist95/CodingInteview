package Hackerank.DictAndHashMap;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TwoString {
    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        int[] dict = new int[26];
        for (char c : s1.toCharArray()) {
            dict[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            if (dict[c - 'a'] > 0) {
                return "YES";
            }
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s1 = "hi";

        String s2 = "world";

        String result = twoStrings(s1, s2);

        System.out.println(result);


    }
}
