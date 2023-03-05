import java.util.*;

class Wave {
    void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    void sortInWave(int arr[], int n) {

        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i += 2)
            swap(arr, i, i + 1);
    }

    public static void main(String args[]) {
        Wave ob = new Wave();
        int arr[] = { 1, 9, 150, 5, 8, 6, 33 };
        int n = arr.length;
        ob.sortInWave(arr, n);
        for (int i : arr)
            System.out.print(i + " ");
    }
}
