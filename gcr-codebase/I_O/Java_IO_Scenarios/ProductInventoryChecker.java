import java.io.*;

public class ProductInventoryChecker {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("inventory.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("-");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    int quantity = Integer.parseInt(parts[1].trim());

                    if (quantity == 0) {
                        System.out.println(name + " is out of stock");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Inventory file not found.");
        } catch (IOException e) {
            System.out.println("Error reading inventory file.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity format in file.");
        }
    }
}