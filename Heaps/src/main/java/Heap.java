/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 09/12/19 | 12:31 PM
 */
public class Heap {
    private int arr[];
    private int capacity;
    private int size;
    private int HEAP_TYPE;

    public Heap(int capacity, int HEAP_TYPE) {
        this.capacity = capacity;
        this.HEAP_TYPE = HEAP_TYPE;
        this.arr = new int[capacity];
        this.size = 0;
        if (HEAP_TYPE == 1) {
            arr[0] = Integer.MAX_VALUE;
        }
        arr[0] = HEAP_TYPE == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public int getParent(int i) {
        int pos = (i - 1)/2;
        if (pos <= 0 || pos > this.capacity)
            return -1;
        return pos;
    }

    public int getLeftChild(int i) {
        int pos = 2*i + 1;
        if (pos >= this.capacity) {
            return -1;
        }
        return this.arr[pos];
    }

    public int getRightChild(int i) {
        int pos = 2*i + 2;
        if (pos >= this.capacity) {
            return -1;
        }
        return this.arr[pos];
    }
}
