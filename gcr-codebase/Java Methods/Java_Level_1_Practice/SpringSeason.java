public class SpringSeason {
    public static boolean checkSpringSeason(int m, int d) {
        if (m == 3 && d >= 20 && d <= 31) return true;
        if (m == 4 && d >= 1 && d <= 30) return true;
        if (m == 5 && d >= 1 && d <= 31) return true;
        if (m == 6 && d >= 1 && d <= 20) return true;
        return false;
    }
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        if (checkSpringSeason(m, d)) System.out.println("Its a Spring Season");
        else System.out.println("Not a Spring Season");
    }
}