import java.util.Scanner;
public class VoteCheckRandom {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = (int)(Math.random() * 90) + 10;
        }
        return ages;
    }
    public static String[][] checkVotingStatus(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) result[i][1] = "false";
            else if (ages[i] >= 18) result[i][1] = "true";
            else result[i][1] = "false";
        }
        return result;
    }
    public static void displayData(String[][] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println("Age: " + data[i][0] + " | Can Vote: " + data[i][1]);
        }
    }
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] status = checkVotingStatus(ages);
        displayData(status);
    }
}