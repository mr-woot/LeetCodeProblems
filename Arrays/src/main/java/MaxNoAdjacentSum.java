/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 07/01/20 | 4:03 PM
 */
public class MaxNoAdjacentSum {
    // 40 10 30 50 -> 90 (40, 50)

    static int calculate(int[] a, int start) {
        if (start >= a.length) return 0;
        return Math.max(a[start] + calculate(a, start + 2), calculate(a, start + 1));
    }
}
