package Hackerank.String;

public class MakingAnagram {
    // Comple   te the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        int[] letters = new int[26];

        for (char c: a.toCharArray()){
            letters[c-'a']++;
        }

        for (char c: b.toCharArray()){
            letters[c-'a']--;
        }

        int sum = 0;

        for (int x:letters){
            sum+=Math.abs(x);
        }
        return sum;

    }


    public static void main(String[] args) {

        String a = "cde";

        String b = "dcf";

        int res = makeAnagram(a, b);

        System.out.println(res);
    }
}
