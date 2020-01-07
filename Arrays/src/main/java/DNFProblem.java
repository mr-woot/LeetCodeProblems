/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 17/12/19 | 3:51 PM
 */
public class DNFProblem {
    public static void solution(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
        int mid = 0;
        int temp = 0;
        while (mid <= high) {
            switch(arr[mid]) {
                case 0: {
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
                }
            }
        }
    }
}
