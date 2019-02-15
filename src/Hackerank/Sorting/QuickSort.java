package Hackerank.Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int a[] = new int[]{9, 2, 6, 4, 3, 5, 1};
        quickSort(a);
        for(int aa: a){
            System.out.print(aa);
        }
    }

    private static void quickSort(int[] a) {
        quickSort(a, 0, a.length - 1);
    }

    private static void quickSort(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = a[(left + right) / 2];
        int index = partition(a, left, pivot, right);
        quickSort(a, left, index - 1);
        quickSort(a, index, right);
    }

    private static int partition(int[] a, int left, int pivot, int right) {
        while (left <= right) {
            while (a[left] < pivot) {
                left++;
            }

            while (a[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(a, left, right);
                left++;
                right--;
            }

        }

        return left;
    }

    private static void swap(int[] a, int left, int right) {
        int temp = a[left];
        a[left] = a[right];
        a[right] = temp;
    }

}
