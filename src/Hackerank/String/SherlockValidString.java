package Hackerank.String;

public class SherlockValidString {
    // Complete the isValid function below.
    static String isValid(String s) {
        int[] letter = new int[26];
        for (char c : s.toCharArray()) {
            int val = c - 'a';
            if (letter[val] > 0) {
                letter[val]--;
            } else {
                letter[val]++;
            }
        }

        int count = 0;
        for (int x : letter) {
            count += x;
            if (count > 1) {
                System.out.println(count);
                return "NO";
            }
        }
        return "YES";
    }


    public static void main(String[] args) {

        String s = "abcdefghhgfedecba";

        String result = isValid(s);

        System.out.println(result);
    }
}
