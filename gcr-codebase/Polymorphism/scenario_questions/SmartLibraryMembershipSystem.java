class LibraryMember {
    String memberName;
    String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }

    public void displayInfo() {
        System.out.println("ID: " + memberId + ", Name: " + memberName);
    }
}

class StudentMember extends LibraryMember {
    public StudentMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFine(int days) {
        return days * 2.0;
    }
}

class FacultyMember extends LibraryMember {
    public FacultyMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFine(int days) {
        return days * 0.5;
    }
}

class GuestMember extends LibraryMember {
    public GuestMember(String name, String id) {
        super(name, id);
    }

    @Override
    public double calculateFine(int days) {
        return days * 5.0;
    }
}

public class SmartLibraryMembershipSystem {
    public static void main(String[] args) {
        LibraryMember[] register = {
            new StudentMember("John Doe", "STU101"),
            new FacultyMember("Dr. Smith", "FAC202"),
            new GuestMember("Jane Carter", "GUEST303")
        };
        String queryId = "FAC202";
        for (LibraryMember m : register) {
            if (m.memberId.equalsIgnoreCase(queryId)) {
                m.displayInfo();
                System.out.println("Calculated fine for 10 overdue days: $" + m.calculateFine(10));
            }
        }
    }
}