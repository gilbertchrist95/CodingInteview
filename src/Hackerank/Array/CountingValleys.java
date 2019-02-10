package Hackerank.Array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

//        String s = "UDDDUDUU";
        String s = "DDUUDDUDUUUD";
        int n = 12;
        int result = countingValleys(n, s);
        System.out.println(result);
//
//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }

    private static int countingValleys(int n, String s) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'D') {
                temp--;
            } else {
                if (temp == -1) count++;
                temp++;
            }
        }
        return count;
    }
}


//    char x = 'U';
//        for (char c : s.toCharArray()) {
//                if (x != c) {
//                if (c == 'D') {
//                x = 'D';
//                } else if (c == 'U') {
//                x = 'U';
//                count += 1;
//                }
//                }
//
//                }