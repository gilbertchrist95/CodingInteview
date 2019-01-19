package Chapter1;

public class CheckPermutation {

    public static void main(String[] argz) {
        String value1 = "dog";
        String value2 = "gcd";
        //dog is permutated with "god"

        boolean isPermutation = isPermutation(value1, value2);
        System.out.println(isPermutation);
    }

    private static boolean isPermutation(String value1, String value2) {

        if (value1.length() != value2.length()) {
            return false;
        }

        int letter[] = new int[256];
        for (int i = 0; i < value1.length(); i++) {
            letter[value1.charAt(i)]++;
        }

        for (int i = 0; i < value2.length(); i++) {
            letter[value2.charAt(i)]--;
            if (letter[value2.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }
}
