package Hackerank.Sorting;

public class FraudulentActivity {

    static int activityNotifications(int[] expenditure, int d) {
        int count = 0;
        int data[] = new int[d];
        for (int i = d; i <= expenditure.length; i++) {
            System.arraycopy(expenditure, i - d, data, 0, d);
            mergeSort(data, new int[d], 0, data.length - 1);
            float median = countMedian(data, d);
            if (expenditure[i-1] >= 2 * median) {
                count++;
            }
        }

        return count;
    }

    private static float countMedian(int[] data, int length) {
        if (length % 2 == 0) {
            return (float)(data[length / 2] + data[(length / 2) - 1]) / 2;
        } else {
            return data[(length / 2)];
        }
    }

    private static void mergeSort(int[] expenditure, int[] temp, int leftStart, int rightEnd) {
        if (leftStart >= rightEnd) {
            return;
        }
        int middle = (leftStart + rightEnd) / 2;
        mergeSort(expenditure, temp, leftStart, middle);
        mergeSort(expenditure, temp, middle + 1, rightEnd);
        mergeHalves(expenditure, temp, leftStart, rightEnd);
    }

    private static void mergeHalves(int[] expenditure, int[] temp, int leftStart, int rightEnd) {
        int leftEnd = (leftStart + rightEnd) / 2;
        int rightStart = leftEnd + 1;
        int size = rightEnd - leftStart + 1;

        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while (left <= leftEnd && right <= rightEnd) {
            if (expenditure[left] <= expenditure[right]) {
                temp[index] = expenditure[left];
                left++;
            } else {
                temp[index] = expenditure[right];
                right++;
            }
            index++;
        }

        System.arraycopy(expenditure, left, temp, index, leftEnd - left + 1);
        System.arraycopy(expenditure, right, temp, index, rightEnd - right + 1);
        System.arraycopy(temp, leftStart, expenditure, leftStart, size);

    }


    public static void main(String[] args) {

        int n = 5;

        int d = 4;

        int[] expenditure = new int[]{1,2,3,4,4};

        int result = activityNotifications(expenditure, d);
        System.out.println(result);
    }
}
