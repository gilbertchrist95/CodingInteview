package Hackerank.DynamicProgramming;

public class Fibonacci {


    public static void main(String[] args) {
        int n = 45;
        int memo[] = new int[n + 1];
//        int result = fib1(n);
//        int result = fib2(n, memo);
        int result = fib3(n);
        System.out.println(result);
    }

    private static int fib3(int n) {

        int buttomUp[] = new int[n + 1];
        buttomUp[1] = 1;
        buttomUp[2] = 1;
        for (int i = 3; i <= n; i++) {
            buttomUp[i] = buttomUp[i - 1] + buttomUp[i - 2];
        }
        return buttomUp[n];
    }

    private static int fib2(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            return fib1(n - 1) + fib1(n - 2);
        }
    }

    private static int fib1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib1(n - 1) + fib1(n - 2);
    }
}
