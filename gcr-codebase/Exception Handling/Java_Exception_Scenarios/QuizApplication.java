public class QuizApplication {
    public static void main(String[] args) {
        String[] answers = {"A", "", "C", "D"};
        
        for (int i = 0; i <= 5; i++) {
            try {
                if (answers[i].equals("A")) {
                    System.out.println("Answer " + i + " is correct");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception: Trying to access answer out of range at index " + i);
            } catch (NullPointerException e) {
                System.out.println("Exception: Null answer found at index " + i);
            }
        }
    }
}