// Topic: Instance vs Class Variables - Online Course Management
public class OnlineCourseManagement {
    String courseName;
    int duration;
    double fee;
    static String instituteName = "Default Institute";

    public OnlineCourseManagement(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Institute: " + instituteName + " | Course: " + courseName);
    }

    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }

    public static void main(String[] args) {
        OnlineCourseManagement c1 = new OnlineCourseManagement("Java", 3, 500);
        OnlineCourseManagement.updateInstituteName("Tech Academy");
        c1.displayCourseDetails();
    }
}