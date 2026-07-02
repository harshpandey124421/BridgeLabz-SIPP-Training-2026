import java.util.Stack;

public class RemoveDuplicateLetters {
    public String removeDuplicateLetters(String s) {
        int[] frequency = new int[26];
        boolean[] insideStack = new boolean[26];
        for (char c : s.toCharArray()) {
            frequency[c - 'a']++;
        }
        Stack<Character> history = new Stack<>();
        for (char c : s.toCharArray()) {
            frequency[c - 'a']--;
            if (insideStack[c - 'a']) {
                continue;
            }
            while (!history.isEmpty() && history.peek() > c && frequency[history.peek() - 'a'] > 0) {
                insideStack[history.pop() - 'a'] = false;
            }
            history.push(c);
            insideStack[c - 'a'] = true;
        }
        StringBuilder res = new StringBuilder();
        while (!history.isEmpty()) {
            res.append(history.pop());
        }
        return res.reverse().toString();
    }
}