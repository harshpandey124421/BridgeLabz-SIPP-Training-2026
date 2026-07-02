import java.util.*;

public class Q4_SmartClassroomAttendanceTracker {
    static HashMap<String, ArrayList<String>> attendance = new HashMap<>();

    static void markAttendance(String subject, String student) {
        attendance.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> students = attendance.get(subject);
        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student + " marked present in " + subject);
        } else {
            System.out.println(student + " already marked present in " + subject);
        }
    }

    static void displayAttendance() {
        for (String subject : attendance.keySet()) {
            ArrayList<String> students = attendance.get(subject);
            System.out.println("Subject: " + subject);
            for (String s : students) {
                System.out.println("  " + s);
            }
            System.out.println("Total present: " + students.size());
        }
    }

    public static void main(String[] args) {
        markAttendance("Java", "Harsh");
        markAttendance("Java", "Amit");
        markAttendance("Java", "Harsh");
        markAttendance("Python", "Neha");
        markAttendance("Python", "Harsh");

        System.out.println();
        displayAttendance();
    }
}
