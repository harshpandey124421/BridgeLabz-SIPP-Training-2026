// Subtopic: File I/O - Appending to an existing file
import java.io.*;

public class AppendReportCard {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("report_card.txt", true); 
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("Name: Late Entry | Average: 75.5");
            
            pw.close();
            System.out.println("New result appended successfully.");
            
        } catch (IOException e) {
            System.out.println("Error appending to file.");
        }
    }
}