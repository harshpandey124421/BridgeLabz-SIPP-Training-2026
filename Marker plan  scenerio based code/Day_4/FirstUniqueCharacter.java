// Subtopic: Strings - First non-repeating character
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String log = "surveillance";
        
        for (int i = 0; i < log.length(); i++) {
            char ch = log.charAt(i);
            if (log.indexOf(ch) == log.lastIndexOf(ch)) {
                System.out.println("First unique char: " + ch);
                break;
            }
        }
    }
}