import java.util.Arrays;

public class insertionsort {
    static void insertionsort(int arr[], int n) {
        if (n <= 1)
            return;
        insertionsort(arr, n - 1);
        int last = arr[n - 1];
        int j = n - 2;
        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = last;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 1, 177, 577, 666 };

        insertionsort(arr, arr.length);

        System.out.println(Arrays.toString(arr));
    }
}
