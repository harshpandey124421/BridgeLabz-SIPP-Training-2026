import java.io.*;
import java.util.Scanner;

public class SchoolResultPortal {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new File("students.txt"));
             FileWriter fw = new FileWriter("report_card.txt", true);
             BufferedWriter bw = new BufferedWriter(fw);
             PrintWriter pw = new PrintWriter(bw)) {

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
                String name = parts[0];
                int totalMarks = 0;
                int count = 0;

                for (int i = 1; i < parts.length; i++) {
                    totalMarks += Integer.parseInt(parts[i].trim());
                    count++;
                }

                double average = count > 0 ? (double) totalMarks / count : 0.0;
                pw.println("Student: " + name + " | Average: " + average);
            }
            System.out.println("Report card generated.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error: File reading/writing failed.");
        }
    }
}