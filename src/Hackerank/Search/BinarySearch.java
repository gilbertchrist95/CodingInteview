package Hackerank.Search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 13, 20, 29, 30, 100};
        int search = 3;
        boolean found = binarySearch(array, search);
        System.out.println(found);
    }

    private static boolean binarySearch(int[] array, int search) {
        return binarySearch(array, search, 0, array.length - 1);
    }

    private static boolean binarySearch(int[] array, int search, int left, int right) {
        if (left > right) {
            return false;
        }
        int middle = left + ((right - left) / 2);
        if (array[middle] == search) {
            return true;
        } else if (array[middle] > search) {
            return binarySearch(array, search, left, middle);
        } else {
            return binarySearch(array, search, middle + 1, right);
        }
    }

}
