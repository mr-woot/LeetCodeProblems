import java.util.HashMap;
import java.util.Map;

/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 07/01/20 | 2:08 PM
 */
public class MostFrequentElementInArray {
    static int find(int [] arr) {
        if (arr.length == 0) return -1;
        Map<Integer, Integer> freq = new HashMap<>();
        int maxFreq = 0;
        int maxFreqEl = arr[0];
        int maxOfAll = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                freq.put(arr[i], freq.get(arr[i]) + 1);
                if (freq.get(arr[i]) > maxFreq) {
                    maxFreq = freq.get(arr[i]);
                    maxFreqEl = arr[i];
                }
            } else {
                freq.put(arr[i], 1);
            }
            if (maxOfAll < maxFreqEl) {
                maxOfAll = maxFreqEl;
            }
        }
        return maxOfAll;
    }

    static void printfrequency(int arr[], int n) {
        for (int j = 0; j < n; j++) {
            arr[j] = arr[j] - 1;
        }

        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] = arr[arr[i] % n] + n;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + "->" + arr[i] / n);
        }
    }

    static int max(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += n;
        }
        int max = arr[0], result = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                result = i;
            }
        }
        return result;
    }
}
