package Hackerank.DictAndHashMap;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountTriplet {
    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        long count = 0;
        Map<Long, Long> map1 = new HashMap<>();
        Map<Long, Long> map2 = new HashMap<>();
        for (long a : arr) {
            count += map2.getOrDefault(a, 0L);
            if (map1.containsKey(a)) {
                map2.put(a * r, map2.getOrDefault(a * r, 0L) + map1.get(a));
            }
            map1.put(a * r, map1.getOrDefault(a * r, 0L) + 1);
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = 2;

        long r = 2;

//        String[] arrItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Long> arr = new ArrayList<>();
        arr.add(1L);
        arr.add(2L);
        arr.add(2L);
        arr.add(4L);
//
//        for (int i = 0; i < n; i++) {
//            long arrItem = Long.parseLong(arrItems[i]);
//            arr.add(arrItem);
//        }

        long ans = countTriplets(arr, r);
        System.out.println(ans);
//        bufferedWriter.write(String.valueOf(ans));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
