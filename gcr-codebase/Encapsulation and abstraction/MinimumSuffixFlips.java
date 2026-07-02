public class MinimumSuffixFlips {
    public int minFlips(String target) {
        int flips = 0;
        char status = '0';
        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) != status) {
                flips++;
                status = target.charAt(i);
            }
        }
        return flips;
    }
}