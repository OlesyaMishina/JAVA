import java.util.Arrays;

// (Дополнительно) Реализовать алгоритм сортировки слиянием
public class Task1 {

    public static int[] mergeSort(int[] arr, int size) {
        if (size < 2) {
            return arr;
        }
        int mid = size / 2;
        int[] left = new int[mid];
        int[] right = new int[size - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < size; i++) {
            right[i - mid] = arr[i];
        }
        mergeSort(left, mid);
        mergeSort(right, size - mid);
        merge(arr, left, right, mid, size - mid);
        return arr;

    }
    
    public static void merge(
            int[] arr, int[] left, int[] right, int indexLeft, int indexRight) {

        int i = 0, j = 0, k = 0;
        while (i < indexLeft && j < indexRight) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < indexLeft) {
            arr[k++] = left[i++];
        }
        while (j < indexRight) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] input = { 8, 14, 0, 6, 1, 21, 19, 11, 7 };
        System.out.println(Arrays.toString(mergeSort(input, input.length)));
    }
}
