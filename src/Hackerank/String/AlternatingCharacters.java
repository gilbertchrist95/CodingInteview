package Hackerank.String;

public class AlternatingCharacters {

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int countTotal = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int count = 0;
            for (int j = i+1; j < s.length(); j++) {
                if(c == s.charAt(j)){
                    count++;
                }else{
                    break;
                }
            }
            countTotal+=count;
            i+=++count;
        }
        return countTotal;
    }


    public static void main(String[] args) {

        String s = "BABABA";

        int result = alternatingCharacters(s);
        System.out.println(result);
    }

}
