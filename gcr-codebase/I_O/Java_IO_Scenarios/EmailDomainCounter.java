import java.io.*;

public class EmailDomainCounter {
    public static void main(String[] args) {
        int gmailCount = 0;
        int yahooCount = 0;
        int otherCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("emails.txt"))) {
            String email;
            while ((email = br.readLine()) != null) {
                if (email.contains("@")) {
                    String domain = email.substring(email.indexOf("@") + 1).toLowerCase();
                    if (domain.equals("gmail.com")) {
                        gmailCount++;
                    } else if (domain.equals("yahoo.com")) {
                        yahooCount++;
                    } else {
                        otherCount++;
                    }
                }
            }
            System.out.println("Gmail users: " + gmailCount);
            System.out.println("Yahoo users: " + yahooCount);
            System.out.println("Other users: " + otherCount);

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}