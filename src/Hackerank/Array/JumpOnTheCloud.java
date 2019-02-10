package Hackerank.Array;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JumpOnTheCloud {
    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        int length = c.length;
        int i = 0;
        while (i < length) {
            if (i + 2 <=length && c[i + 2] != 1) {
                count++;
                i +=2;
            } else if (i + 1 <=length && c[i + 1] != 1){
                count++;
                i+=1;
            }
        }
        System.out.println(count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = {0, 0, 0, 0, 1, 0};

//        String[] cItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int cItem = Integer.parseInt(cItems[i]);
//            c[i] = cItem;
//        }

        int result = jumpingOnClouds(c);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();
//
//        scanner.close();
    }
}
