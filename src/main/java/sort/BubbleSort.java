package sort;

import java.util.Arrays;

//冒泡排序
//时间复杂度O(n^2),空间复杂度O(1),稳定
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 6, 3, 1, 9};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
