import java.util.*;

public class Q3_EventEntryVerificationSystem {
    static HashSet<String> registeredEmails = new HashSet<>();

    static void registerParticipant(String email) {
        if (registeredEmails.add(email)) {
            System.out.println("Registered successfully: " + email);
        } else {
            System.out.println("Duplicate registration rejected: " + email);
        }
    }

    static void displayParticipants() {
        System.out.println("Registered Participants:");
        for (String email : registeredEmails) {
            System.out.println(email);
        }
        System.out.println("Total attendees: " + registeredEmails.size());
    }

    public static void main(String[] args) {
        registerParticipant("harsh@gmail.com");
        registerParticipant("amit@gmail.com");
        registerParticipant("neha@gmail.com");
        registerParticipant("harsh@gmail.com");

        System.out.println();
        displayParticipants();
    }
}
