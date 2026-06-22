public class StudentGradesRandom {
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double pct = Math.round(((total / 300.0) * 100) * 100.0) / 100.0;
            stats[i][0] = total; stats[i][1] = avg; stats[i][2] = pct;
        }
        return stats;
    }
    public static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][1];
        for (int i = 0; i < stats.length; i++) {
            double pct = stats[i][2];
            if (pct >= 80) grades[i][0] = "A";
            else if (pct >= 70) grades[i][0] = "B";
            else if (pct >= 60) grades[i][0] = "C";
            else if (pct >= 50) grades[i][0] = "D";
            else if (pct >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }
    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        for (int i = 0; i < scores.length; i++) {
            System.out.println("P: " + scores[i][0] + " C: " + scores[i][1] + " M: " + scores[i][2] + 
            " | Total: " + stats[i][0] + " Avg: " + stats[i][1] + " Pct: " + stats[i][2] + "% Grade: " + grades[i][0]);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        String[][] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}