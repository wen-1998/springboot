package sort;

import java.util.Arrays;

//选择排序
//时间复杂度O(n^2),空间复杂度O(1),不稳定
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 6, 3, 1, 9,};
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
