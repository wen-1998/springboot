package sort;

import java.util.Arrays;

//插入排序
//最坏时间复杂度O(n^2),最好为O(n);空间复杂度O(1),稳定
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 6, 3, 1, 9,};
        for (int i = 1; i < arr.length; i++) {
            //定义插入的数
            int insertValue = arr[i];
            //插入的数的前一个数的下标
            int insertIndex = i - 1;
            while (insertIndex >= 0 && arr[insertIndex] > insertValue) {
                //如果插入数小于前一个数，把数放到插入数后面
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
