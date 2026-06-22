import java.io.*;

public class GroceryBillReader {
    public static void main(String[] args) {
        int lineCount = 0;
        try (FileReader fr = new FileReader("bill.txt");
             BufferedReader br = new BufferedReader(fr)) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            System.out.println("Total lines: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("Bill file not found.");
        } catch (IOException e) {
            System.out.println("Error reading the bill.");
        }
    }
}