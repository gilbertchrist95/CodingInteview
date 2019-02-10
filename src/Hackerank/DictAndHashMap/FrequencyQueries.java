package Hackerank.DictAndHashMap;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FrequencyQueries {


    // Complete the freqQuery function below.
    static List<Integer> freqQuery(List<List<Integer>> queries) {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap();

        for (List<Integer> list1 : queries) {
            int value = list1.get(0);
            int val = list1.get(1);
            switch (value) {
                case 1: {
                    map.put(val, map.getOrDefault(val, 0) + 1);
                    break;
                }
                case 2: {
                    if (map.containsKey(val) && map.get(val) > 0) {
                        map.put(val, map.get(val) - 1);
                    }
                    break;
                }
                case 3: {
                    boolean addOne = map.containsValue(val);
                    list.add(addOne ? 1 : 0);
                    break;
                }
            }
        }

        return list;

    }

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int q = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> queries = new ArrayList<>();
//        queries.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(2, 2)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(3, 2)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(1, 1)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(2, 1)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(3, 2)));

        queries.add(new ArrayList<Integer>(Arrays.asList(1, 3)));
        queries.add(new ArrayList<Integer>(Arrays.asList(2, 3)));
        queries.add(new ArrayList<Integer>(Arrays.asList(3, 2)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, 4)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, 5)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, 5)));
        queries.add(new ArrayList<Integer>(Arrays.asList(1, 4)));
        queries.add(new ArrayList<Integer>(Arrays.asList(3, 2)));
        queries.add(new ArrayList<Integer>(Arrays.asList(2, 4)));
        queries.add(new ArrayList<Integer>(Arrays.asList(3, 2)));

//        queries.add(new ArrayList<Integer>(Arrays.asList(3, 4)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(2, 1003)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(1, 16)));
//        queries.add(new ArrayList<Integer>(Arrays.asList(3, 1)));


//        for (int i = 0; i < q; i++) {
//            String[] queriesRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//            List<Integer> queriesRowItems = new ArrayList<>();
//
//            for (int j = 0; j < 2; j++) {
//                int queriesItem = Integer.parseInt(queriesRowTempItems[j]);
//                queriesRowItems.add(queriesItem);
//            }
//
//            queries.add(queriesRowItems);
//        }

        List<Integer> ans = freqQuery(queries);

        for (int a :
                ans) {
            System.out.println(a);
        }

//        for (int i = 0; i < ans.size(); i++) {
//            bufferedWriter.write(String.valueOf(ans.get(i)));
//
//            if (i != ans.size() - 1) {
//                bufferedWriter.write("\n");
//            }
//        }
//
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
