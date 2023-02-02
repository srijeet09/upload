
class selection {
    public static void selectionSort(int arr[]) {

        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int sm = arr[index];
            arr[i] = sm;
        }
    }

    public static void main(String args[]) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        selectionSort(arr1);
    }
}
