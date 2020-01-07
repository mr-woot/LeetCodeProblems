import java.util.Arrays;

/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 09/12/19 | 2:50 PM
 */
public class PREM001 {

    private static int height[] = new int[1000];
    private static int count = 0;

    static {
        Arrays.fill(height, -1);
    }

    public static int sol(int arr[], int id) {
        if (arr[id] == -1) return 0;
        if (height[id] != -1) return height[id];
        height[id] = 1 + sol(arr, arr[id]);
        count++;
        return height[id];
    }

    public static int solution(int arr[], int n) {
        int height = 0;
        for (int i = 0; i < n; i++) {
            int currentHeight = sol(arr, i);
            if (currentHeight > height) {
                height = currentHeight;
            }
        }
        return height;
    }
}
