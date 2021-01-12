package sort;

import java.util.Arrays;

//快速排序
//最坏时间复杂度O(n^2),最好为O(nlog2n);空间复杂度O(log2n),不稳定
public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int value = arr[low];
        //从右往左
        while (i < j) {
            while (arr[j] >= value && i < j) {
                j--;
            }
            while (arr[i] <= value && i < j) {
                i++;
            }
            if (i < j) {
                int t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        arr[low] = arr[i];
        arr[i] = value;
        quickSort(arr, low, j - 1);
        quickSort(arr, j + 1, high);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 6, 3, 1, 9,};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}

