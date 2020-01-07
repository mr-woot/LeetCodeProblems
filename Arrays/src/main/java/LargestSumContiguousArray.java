/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 07/01/20 | 11:42 AM
 */
public class LargestSumContiguousArray {
    static int findSum(int[] arr) {
        if (arr.length == 0) return 0;
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;
        for (int i = 0; i < arr.length; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }
}
