package Hackerank.Sorting;

public class CountingInversion {

    // Complete the countInversions function below.
    static long countInversions(int[] arr) {
        int temp[] = arr.clone();
        return countInversions(arr, temp, 0, arr.length - 1);

    }

    private static long countInversions(int[] arr, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) return 0;
        long count = 0;
        int middle = (leftStart + rightEnd) / 2;
        count += countInversions(arr, temp, leftStart, middle);
        count += countInversions(arr, temp, middle + 1, rightEnd);
        count += merge(arr, temp, leftStart, rightEnd);
        return count;
    }

    private static long merge(int[] array, int[] temp, int leftStart, int rightEnd) {
        long count = 0;
        int leftEnd = (rightEnd + leftStart) / 2;
        int rightStart = leftEnd + 1;
        int size = (rightEnd - leftStart + 1);

        int left = leftStart;
        int index = leftStart;
        int right = rightStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (array[left] <= array[right]) {
                temp[index] = array[left];
                left++;
            } else {
                temp[index] = array[right];
                right++;
            }
            index++;
        }


        System.arraycopy(array, left, temp, index, leftEnd - left + 1);
        System.arraycopy(array, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, array, leftStart, size);


        return count;
    }


    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 1, 2, 2};
        long result = countInversions(arr);
        System.out.println(result);
    }

}
