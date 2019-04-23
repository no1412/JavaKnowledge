import java.util.Arrays;

/**
 * @program: Test
 * @description: 归并排序
 * @author: Malcolm Li
 * @create: 2019-04-23 22:05
 */
public class TestMergeSort {

    /**
     *
     * @param arr 目标数组
     * @param left 起始位置
     * @param mid 中间位置
     * @param right 结束位置
     */
    public static void merge(int[] arr, int left, int mid, int right) {
        int q = 0;
        // 定义左边起始点
        int i = left;
        // 定义右边的起始点
        int j = mid + 1;
        // 定义一个数组来存放排序后的数据
        int[] temp = new int[right - left + 1];
        while (i <= mid && j <= right) {
            temp[q++] = arr[i] < arr[j] ? arr[i++] : arr[j++];
        }
        // 如果还有剩余的元素，填入到temp中
        while (i <= mid) {
            temp[q++] = arr[i++];
        }

        while (j <= right) {
            temp[q++] = arr[j++];
        }

        // 把排序的结果赋值给原来的数组
        System.arraycopy(temp, 0, arr, left, temp.length);
    }

    /**
     * 归并并且排序
     * @param arr 目标数组
     * @param left 起始位置
     * @param right 结束位置
     */
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 8, 9 , 5 ,5 , 4 , 10, -8, 990, 850};
        mergeSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
