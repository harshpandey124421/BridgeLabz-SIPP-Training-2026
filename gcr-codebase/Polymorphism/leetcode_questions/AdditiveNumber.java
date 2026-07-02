public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        int len = num.length();
        for (int i = 1; i <= len / 2; i++) {
            if (num.charAt(0) == '0' && i > 1) {
                return false;
            }
            for (int j = 1; Math.max(i, j) <= len - i - j; j++) {
                if (num.charAt(i) == '0' && j > 1) {
                    break;
                }
                if (isValidSequence(i, j, num)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isValidSequence(int i, int j, String num) {
        String n1 = num.substring(0, i);
        String n2 = num.substring(i, i + j);
        int offset = i + j;
        while (offset < num.length()) {
            String sumStr = evaluateSumString(n1, n2);
            if (!num.startsWith(sumStr, offset)) {
                return false;
            }
            offset += sumStr.length();
            n1 = n2;
            n2 = sumStr;
        }
        return true;
    }

    private String evaluateSumString(String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        int idx1 = s1.length() - 1;
        int idx2 = s2.length() - 1;
        int carry = 0;
        while (idx1 >= 0 || idx2 >= 0 || carry > 0) {
            int net = carry;
            if (idx1 >= 0) net += s1.charAt(idx1--) - '0';
            if (idx2 >= 0) net += s2.charAt(idx2--) - '0';
            ans.append(net % 10);
            carry = net / 10;
        }
        return ans.reverse().toString();
    }
}