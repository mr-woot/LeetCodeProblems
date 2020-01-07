/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 17/12/19 | 4:42 PM
 */
public class BubbleSort {
    public static int sortSwapCount(int[] a) {
        int len = a.length;
        if (a == null || len == 0) return -1;
//        boolean isSwapped;
        int count = 0;
        for (int i = 0; i < len - 1; i++) {
//            isSwapped = false;
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
//                    isSwapped = true;
                    count++;
                }
//                if (!isSwapped) break;
            }
        }
        return count;
    }
}
