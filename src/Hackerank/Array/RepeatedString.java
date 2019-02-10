package Hackerank.Array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatedString {
    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
//        int max = 0;
//        int length = s.length();
//        for (int i = 0; i < n; i++) {
//            if(s.charAt(i%length)=='a'){
//                max++;
//            }
//        }
//        return max;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') count++;
        }
        long countt = n / s.length() * count;
        if (n / s.length() != 0) {
            for (int i = 0; i < n % s.length(); i++) {
                if(s.charAt(i)=='a')countt++;
            }
        }
        return countt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "a";

        long n = 100000000;
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }
}
