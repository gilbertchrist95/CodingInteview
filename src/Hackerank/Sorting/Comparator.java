package Hackerank.Sorting;


import java.util.Arrays;
import java.util.Scanner;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

}


public class Comparator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for (int i = 0; i < n; i++) {
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for (Player aPlayer : player) {
            System.out.printf("%s %s\n", aPlayer.name, aPlayer.score);
        }


    }


    private static class Checker implements java.util.Comparator<Player> {
        @Override
        public int compare(Player a, Player b) {
            if (a.score == b.score) {
                return a.name.compareTo(b.name);
            } else {
                return b.score - a.score;
            }
        }
    }
}
