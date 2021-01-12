package sort;

import java.util.Arrays;

//基数排序
//时间复杂度O(nd)),空间复杂度O(r+n),稳定
public class RadixSort {
    public static void raixSort(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  //得到数组中最大的数
            }
        }
        int maxLength = (max + "").length();  //得到最大数的位数
        int[][] bucket = new int[10][maxLength];  //定义二维数组“桶”，即每个桶都是一个二维数组
        int[] counts = new int[10];  //定义一维数组记录每个桶中每次放入多少个元素
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            for (int j = 0; j < arr.length; j++) {
                int element = arr[j] / n % 10;  //元素的每个位置的数都能处理到
                bucket[element][counts[element]] = arr[j];  //bucket[][]就是桶中元素的个数
                counts[element]++;
            }
            int index = 0;
            for (int k = 0; k < bucket.length; k++) {
                if (counts[k] != 0) {  //桶中有元素，对桶进行遍历
                    for (int l = 0; l < counts[k]; l++) {
                        arr[index++] = bucket[k][l];  //桶中的元素放回原数组
                    }
                }
                counts[k] = 0;  //每处理完一个桶，都要清零换下一个
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 7, 8, 6, 3, 1, 9,};
        raixSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
