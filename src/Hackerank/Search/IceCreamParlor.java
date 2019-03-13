package Hackerank.Search;

import java.util.HashMap;
import java.util.Map;

public class IceCreamParlor {

    public static void main(String[] args) {
        int[] cost = new int[]{1, 4, 5, 3, 2};
        int money = 4;
        String whatFlavours = getFlavours(cost, money);
        System.out.println(whatFlavours);
    }

    private static String getFlavours(int[] cost, int money) {
        String result = null;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < cost.length; i++) {
            final int compliment = money - cost[i];
            if (map.containsKey(compliment)) {
                result = map.get(compliment) + " " + (++i);
                return result;
            } else {
                final int position = i+1;
                map.put(cost[i], position);
            }
        }
        return result;
    }

}
