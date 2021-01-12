package sort;

//堆排序
//时间复杂度O(nlog2n),空间复杂度O(1),不稳定
public class HeapSort {
    public static void heapSort(int[] arr) {
        heapInsert(arr);
        int size = arr.length;
        while (size > 1) {
            swap(arr, 0, size - 1);
            size--;
            heapify(arr, 0, size);
        }
    }

    private static void heapInsert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentIndex = i;
            int fatherIndex = (currentIndex - 1) / 2;
            while (currentIndex > fatherIndex) {
                swap(arr, currentIndex, fatherIndex);
                currentIndex = fatherIndex;
                fatherIndex = (currentIndex - 1) / 2;
            }
        }
    }

    private static void heapify(int[] arr, int index, int size) {
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largestIndex;
        while (left < size) {
            if (arr[left] < arr[size] && right < size) {
                largestIndex = right;
            } else {
                largestIndex = left;
            }
            if (arr[index] > arr[largestIndex]) {
                largestIndex = index;
            }
            if (index == largestIndex) {
                break;
            }
            //父结点不是最大值，与孩子中较大的值交换
            swap(arr, largestIndex, index);
            //将索引指向孩子中较大的值的索引
            index = largestIndex;
            //重新计算交换之后的孩子的索引
            left = 2 * index + 1;
            right = 2 * index + 2;
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
