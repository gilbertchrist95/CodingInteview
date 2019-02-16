package Hackerank.Sorting;

public class MarkAndToys {
    // Complete the maximumToys function below.
    static int maximumToys(int[] prices, int k) {
        int count = 0;
        quickSort(prices);
        for (int p : prices) {
            k -= p;
            if (k > 0) {
                count++;
            } else {
                return count;
            }
        }
        return count;
    }

    private static void quickSort(int[] prices) {
        quickSort(prices, 0, prices.length - 1);
    }

    private static void quickSort(int[] prices, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivot = prices[(left + right) / 2];
        int index = partition(prices, left, right, pivot);
        quickSort(prices, left, index - 1);
        quickSort(prices, index, right);
    }

    private static int partition(int[] prices, int left, int right, int pivot) {
        while (left <= right) {
            while (prices[left] < pivot) {
                left++;
            }

            while (prices[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(prices, left, right);
                left++;
                right--;
            }
        }

        return left;
    }

    private static void swap(int[] prices, int left, int right) {
        int temp = prices[left];
        prices[left] = prices[right];
        prices[right] = temp;
    }


    public static void main(String[] args) {

        int n = 7;

        int k = 50;

        int[] prices = new int[]{1, 12, 5, 111, 200, 1000, 10};

        int result = maximumToys(prices, k);
        System.out.println(result);

    }
}
