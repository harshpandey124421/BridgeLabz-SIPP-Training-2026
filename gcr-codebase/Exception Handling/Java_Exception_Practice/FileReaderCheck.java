import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderCheck {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            FileReader fr = new FileReader(file);
            Scanner sc = new Scanner(fr);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
            fr.close();
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}