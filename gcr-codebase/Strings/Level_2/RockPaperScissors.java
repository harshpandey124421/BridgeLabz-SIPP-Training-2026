import java.util.Scanner;
public class RockPaperScissors {
    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        if (choice == 1) return "paper";
        return "scissors";
    }
    public static String getWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper"))) return "User";
        return "Computer";
    }
    public static String[][] getStats(int userWins, int compWins, int total) {
        String[][] stats = new String[2][2];
        stats[0][0] = "User Win %";
        stats[0][1] = String.valueOf(((double)userWins / total) * 100);
        stats[1][0] = "Comp Win %";
        stats[1][1] = String.valueOf(((double)compWins / total) * 100);
        return stats;
    }
    public static void displayStats(String[][] stats) {
        System.out.println(stats[0][0] + ": " + stats[0][1] + "%");
        System.out.println(stats[1][0] + ": " + stats[1][1] + "%");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;
        for (int i = 0; i < games; i++) {
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();
            String winner = getWinner(user, comp);
            System.out.println("Game " + (i+1) + ": Comp chose " + comp + " -> " + winner + " wins");
            if (winner.equals("User")) userWins++;
            if (winner.equals("Computer")) compWins++;
        }
        String[][] stats = getStats(userWins, compWins, games);
        displayStats(stats);
        sc.close();
    }
}