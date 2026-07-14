// Subtopic: Generics - AI-Driven Resume Screening System
import java.util.List;

abstract class JobRole {
    String candidateName;
    public JobRole(String candidateName) { this.candidateName = candidateName; }
    public String getCandidateName() { return candidateName; }
}

class SoftwareEngineer extends JobRole {
    public SoftwareEngineer(String candidateName) { super(candidateName); }
}

class DataScientist extends JobRole {
    public DataScientist(String candidateName) { super(candidateName); }
}

class Resume<T extends JobRole> {
    private T role;
    public Resume(T role) { this.role = role; }
    public T getRole() { return role; }
}

public class ResumeScreeningSystem {
    public static void processResumes(List<? extends JobRole> resumes) {
        for (JobRole role : resumes) {
            System.out.println("Processing: " + role.getCandidateName());
        }
    }
}