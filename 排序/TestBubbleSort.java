/**
 * @description: 冒泡排序
 * @author: Malcolm Li
 * @create: 2019-04-10 22:42
 */
public class TestBubbleSort {

    public static void bubbleSort(int[] data) {
        int temp;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                // 每次比较相邻的两个值并按照添加交换顺序
                if (data[j] < data[i]) {
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }
    }
}
