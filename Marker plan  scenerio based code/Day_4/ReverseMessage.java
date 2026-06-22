// Subtopic: Strings - Reverse a string
public class ReverseMessage {
    public static void main(String[] args) {
        String msg = "meetmeatmidnight";
        String reversed = "";
        
        for (int i = msg.length() - 1; i >= 0; i--) {
            reversed += msg.charAt(i);
        }
        
        System.out.println("Reversed: " + reversed);
    }
}