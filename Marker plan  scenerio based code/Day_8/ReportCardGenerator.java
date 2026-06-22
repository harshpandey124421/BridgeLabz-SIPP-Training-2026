// Subtopic: File I/O - Reading, Computing, and Writing
import java.io.*;
import java.util.Scanner;

public class ReportCardGenerator {
    public static void main(String[] args) {
        try {
            File file = new File("students.txt");
            if (!file.exists()) file.createNewFile();
            
            Scanner sc = new Scanner(file);
            FileWriter fw = new FileWriter("report_card.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            while (sc.hasNextLine()) {
                String[] data = sc.nextLine().split(",");
                String name = data[0];
                int total = 0;
                
                for (int i = 1; i < data.length; i++) {
                    total += Integer.parseInt(data[i].trim());
                }
                
                double avg = (data.length - 1) > 0 ? (double) total / (data.length - 1) : 0;
                pw.println("Name: " + name + " | Average: " + avg);
            }
            
            pw.close();
            sc.close();
            System.out.println("Report Card Generated.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: students.txt not found.");
        } catch (IOException e) {
            System.out.println("Error: File operation failed.");
        }
    }
}