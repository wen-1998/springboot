package sort;

import java.util.Arrays;

//归并排序
//时间复杂度O(nlog2n),空间复杂度O(n),稳定
public class MergeSort {
    public static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid, temp);  //向左递归分解
            mergeSort(arr, mid + 1, right, temp);  //向右递归分解
            merge(arr, left, right, mid, temp);  //每分解一次就合并一次
        }
    }

    /**
     * 合并的方法
     *
     * @param arr   待排序的数组
     * @param left  左边有序序列的初始索引
     * @param right 中间索引
     * @param mid+1 右边有序序列的初始索引
     * @param temp  做中转的数组
     */
    public static void merge(int[] arr, int left, int right, int mid, int[] temp) {
        int i = left;  //左边有序序列的初始索引
        int j = mid + 1;  //右边有序序列的初始索引
        int t = 0;  //中转数组temp的索引
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                i++;
                t++;
            } else {
                temp[t] = arr[j];
                j++;
                t++;
            }
        }
        while (i <= mid) {
            temp[t] = arr[i];  //把左边剩余的数组放到temp中
            i++;
            t++;
        }
        while (j <= right) {
            temp[t] = arr[j];  //把右边剩余的数组放到temp中
            j++;
            t++;
        }
        t = 0;
        int index = left;
        while (index <= right) {
            arr[index] = temp[t];  // 把temp数组的元素复制到原数组
            index++;
            t++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 6, 3, 1, 9,};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));
    }
}
