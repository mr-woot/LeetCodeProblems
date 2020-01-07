/**
 * Project: Algos
 * Contributed By: Tushar Mudgal
 * On: 07/01/20 | 4:58 PM
 */
public class DefangIP {
    static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                result.append(sb).append("[.]");
                sb = new StringBuilder();
            } else {
                sb.append(address.charAt(i));
            }
        }
        result.append(sb);
        return result.toString();
    }
}
