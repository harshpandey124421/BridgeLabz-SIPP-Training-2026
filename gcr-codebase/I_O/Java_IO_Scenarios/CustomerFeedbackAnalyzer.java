import java.io.*;

public class CustomerFeedbackAnalyzer {
    public static void main(String[] args) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("feedback.txt"))) {
            String line;
            int messagesRead = 0;
            while ((line = br.readLine()) != null && messagesRead < 5) {
                if (line.toLowerCase().contains("good")) {
                    count++;
                }
                messagesRead++;
            }
            System.out.println("Good Feedback Count = " + count);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}