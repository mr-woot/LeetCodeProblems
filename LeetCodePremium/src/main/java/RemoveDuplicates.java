/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 07/01/20 | 6:09 PM
 */
public class RemoveDuplicates {
    static int remove(int[] a, int n) {
        if (n == 0 || n == 1) return n;
        int cnt = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i+1]) {
                a[cnt++] = a[i];
            }
        }
        a[cnt++] = a[n - 1];
        return cnt;
    }
}
