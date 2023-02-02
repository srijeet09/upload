import java.util.*;

public class bubble {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++)
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
        }

    }

    public static void main(String[] args) {

        int[] arr1 = { 3, 60, 57, 98 };
        bubble.bubbleSort(arr1);

    }
}
