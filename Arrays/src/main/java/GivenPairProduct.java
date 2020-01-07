/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 19/12/19 | 10:33 AM
 */
public class GivenPairProduct {
    public static void findNumbers(int[] a, int cmp) {
        int len = a.length;
        int start = 0;
        int end = len - 1;
        for (int i = 0; i < len; i++) {
            int pdt = a[start] * a[end];
            if (pdt == cmp){
                System.out.println(a[start] + " " + a[end]);
                return;
            }
            else if (pdt < cmp) start++;
            else if (pdt > cmp) end--;
        }
        System.out.println("Product pair doesn't exists");
    }
}
