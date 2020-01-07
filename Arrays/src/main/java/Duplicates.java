import java.util.HashMap;

/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 06/01/20 | 4:26 PM
 */
public class Duplicates {
    static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int current = nums[i];
            if(map.containsKey(current) && i - map.get(current) <= k) {
                return true;
            } else {
                map.put(current, i);
            }
        }
        return false;
    }
}
