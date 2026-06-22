public class MovieSeatReservation {
    static int[] seats = {101, 102, 103, 104, 105};

    public static int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        int result = getSeat(8);
        System.out.println(result);
    }
}