public class SmartLibrarySystem {
    static String[] books = {"Java", "Python", null, "C++"};

    public static int getBookLength(int index) {
        try {
            return books[index].length();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Custom Message: Invalid book index requested.");
            return -1;
        } catch (NullPointerException e) {
            System.out.println("Custom Message: The book entry is null.");
            return -1;
        }
    }

    public static void main(String[] args) {
        getBookLength(5);
        getBookLength(2);
        System.out.println(getBookLength(0));
    }
}