package Chapter1;

public class URLify {
    public static void main(String[] args) {
        String input = "Mr John Smith        ";
        char[] inputt = input.toCharArray();
        int trueLength = input.trim().length();
        char[] newInput = ulrify(inputt, trueLength);
        System.out.println(newInput);
    }

    private static char[] ulrify(char[] inputt, int trueLength) {
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (inputt[i] == ' ') spaceCount++;
        }
        int index = trueLength + spaceCount * 2;
        for (int i = trueLength - 1; i > 0; i--) {
            if (inputt[i] == ' ') {
                inputt[index - 1] = '0';
                inputt[index - 2] = '2';
                inputt[index - 3] = '%';
                index -= 3;
            } else {
                inputt[index - 1] = inputt[i];
                index--;
            }
        }
        return inputt;
    }
}
