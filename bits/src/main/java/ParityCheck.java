/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 04/12/19 | 11:31 AM
 */
public class ParityCheck {
    static short parity(long x) {
        x ^= x >>> 32;
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return (short)(x & 0x1);
    }
}
