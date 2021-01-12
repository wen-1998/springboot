package sort;

import java.util.Arrays;

//希尔排序
//时间复杂度最好O(n),最坏O(n^2),空间复杂度O(1),不稳定
public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 6, 3, 1, 9};
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                for (int j = i - gap; j >= 0; j -= gap) {
                    if (arr[j] > arr[j + gap]) {
                        int temp = arr[j];
                        arr[j] = arr[j + gap];
                        arr[j + gap] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
