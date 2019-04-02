/**
 * @description: 插入排序
 * @author: Malcolm Li
 * @create: 2019-04-02 22:25
 */
public class TestDirectionInsertSort {

    public static void directionInsertSort(int[] data) {
        int temp;
        for (int i = 1; i < data.length; i++) {
            // 带插入数据
            temp = data[i];
            // 标记
            int j;
            // 遍历子序列
            for (j = i - 1; j >= 0; j--) {
                if (data[j] > temp) {
                    data[j + 1] = data[j];
                } else {
                    break;
                }
            }
            // 不用移动的情况不需要赋值
            if (j != i) {
                data[j + 1] = temp;
            }
        }
    }
}