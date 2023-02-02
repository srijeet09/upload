class insertionSort {
    public static void Insertion(int arr[]) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int k = arr[j];
            int i = j - 1;
            while ((i > -1 && arr[i] > k)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = k;
        }
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5 };
        insertionSort.Insertion(arr);
    }
}
