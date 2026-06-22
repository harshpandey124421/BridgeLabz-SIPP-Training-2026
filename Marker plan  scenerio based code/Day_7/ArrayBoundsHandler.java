// Subtopic: Exception Handling - ArrayIndexOutOfBoundsException
public class ArrayBoundsHandler {
    public static void main(String[] args) {
        int[] patientRecords = {101, 102, 103};
        try {
            int requestedPatient = patientRecords[5];
            System.out.println(requestedPatient);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index accessed.");
        }
    }
}