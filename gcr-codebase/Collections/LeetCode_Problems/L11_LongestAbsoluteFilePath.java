import java.util.*;

public class L11_LongestAbsoluteFilePath {
    static int lengthLongestPath(String input) {
        String[] lines = input.split("\n");
        HashMap<Integer, Integer> depthLength = new HashMap<>();
        depthLength.put(0, 0);
        int maxLength = 0;
        for (String line : lines) {
            int depth = 0;
            while (depth < line.length() && line.charAt(depth) == '\t') {
                depth++;
            }
            String name = line.substring(depth);
            if (name.contains(".")) {
                int length = depthLength.get(depth) + name.length();
                maxLength = Math.max(maxLength, length);
            } else {
                depthLength.put(depth + 1, depthLength.get(depth) + name.length() + 1);
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String input = "dir\n\tsubdir1\n\t\tfile1.ext\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext";
        System.out.println(lengthLongestPath(input));
    }
}
