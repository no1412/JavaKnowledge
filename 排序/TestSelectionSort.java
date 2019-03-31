/**
 * @description: 选择排序
 * @author: Malcolm Li
 * @create: 2019-03-31 21:23
 */
public class TestSelectionSort {
    public static void selectionSort (int[] data) {
        int temp;
        int flag = 0;
        for (int i = 0; i < data.length; i++) {
            temp = data[i];
            // 初始化标志位
            flag = i;
            for (int j = i + 1; j < data.length; j++) {
                 if (data[j] < temp)  {
                     temp = data[j];
                     // 标记比较后的数值
                     flag = j;
                 }
            }
            // 如果一轮比较后，两值相等，则不需要交换
            if (i != flag) {
                data[flag] = data[i];
                data[i] = temp;
            }
        }
    }
}
