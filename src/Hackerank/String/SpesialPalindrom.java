package Hackerank.String;

import java.util.HashSet;
import java.util.Set;

public class SpesialPalindrom {
    public static void main(String[] args) {
        String s = "asasd";
        long result = substrCount(s.length(), s);
        System.out.println(result);
    }

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long count = s.length();
        int conces = 1;
        int minIndex = -1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {

                count += conces;
                conces++;

                if (minIndex > 0) {
                    if ((minIndex - conces) >= 0 && s.charAt(minIndex - conces) == s.charAt(i)) {
                        count++;
                    } else {
                        // no more possibility of palindromic string
                        // with this midIndex
                        minIndex = -1;
                    }
                }

            } else {
                conces = 1;
                if ((i - 2) > 0 && s.charAt(i) == s.charAt(i - 2)) {
                    count++;
                    minIndex = i - 1;
                } else {
                    minIndex = -1;
                }
            }
        }
        return count;
    }

    /*
    long count = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 2; j < n + 1; j++) {
                if(s.charAt(i)==s.charAt(j-1)){
                    String value = s.substring(i, j);
                    if (check(value)) {
                        count++;
                    }
                }else{
                    System.out.println(s.substring(i, j));
                }

            }
        }
        return count;
     */

    private static boolean check(String substring) {
        Set<Character> set = new HashSet<>();

        int i = 0;
        int j = substring.length() - 1;
        while (i <= j) {
            if (substring.charAt(i) != substring.charAt(j)) {
                return false;
            } else {
                set.add(substring.charAt(i));
            }
            i++;
            j--;
        }
        return set.size() <= 2;
    }
}
