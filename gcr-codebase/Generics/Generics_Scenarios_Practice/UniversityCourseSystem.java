// Subtopic: Generics - Multi-Level University Course Management System
import java.util.List;

abstract class CourseType {
    String title;
    public CourseType(String title) { this.title = title; }
    public String getTitle() { return title; }
}

class ExamCourse extends CourseType {
    public ExamCourse(String title) { super(title); }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String title) { super(title); }
}

class Course<T extends CourseType> {
    private T courseDetails;
    public Course(T courseDetails) { this.courseDetails = courseDetails; }
    public T getCourseDetails() { return courseDetails; }
}

public class UniversityCourseSystem {
    public static void printCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println(course.getTitle());
        }
    }
}