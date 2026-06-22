// Subtopic: Strings - Character classification
public class VowelConsonantCount {
    public static void main(String[] args) {
        String msg = "classified";
        int vowels = 0, consonants = 0;
        
        for (int i = 0; i < msg.length(); i++) {
            char ch = msg.toLowerCase().charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }
}