package Chapter1;

public class IsUniqueChar {
    public static void main(String[] args) {
        String value = "Gilbert";
        boolean isUnique = isUnique(value);
        boolean isUnique2 = isUnique2(value);
        System.out.println(isUnique);
        System.out.println(isUnique2);
    }

    private static boolean isUnique2(String value) {
        int checking = 0;
        for (int i = 0; i < value.length(); i++) {
            int charAt = value.charAt(i) - 'a';
            if ((checking & (1 << charAt)) > 0) {
                return false;
            }
            checking |= 1 << charAt;
        }
        return true;
    }

    private static boolean isUnique(String value) {
        boolean[] chars = new boolean[256];
        for (int i = 0; i < value.length(); i++) {
            int charAt = value.charAt(i);
            if (chars[charAt]) {
                return false;
            }
            chars[charAt] = true;
        }
        return true;
    }


}
