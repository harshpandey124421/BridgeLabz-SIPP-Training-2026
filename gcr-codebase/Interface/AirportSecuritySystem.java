interface LuggageScanner {
    void scanLuggage(String passengerName);
    
    default void displaySecurityGuidelines() {
        System.out.println("Guideline: No liquids over 100ml.");
    }
}

interface PassportVerifier {
    void verifyPassport(String passportNo);
    
    default void displaySecurityGuidelines() {
        System.out.println("Guideline: Passports must be valid for 6 months.");
    }
}

class AirportSecurityManager implements LuggageScanner, PassportVerifier {
    public static boolean isPassportNumberValid(String passportNo) {
        return passportNo != null && passportNo.length() == 8;
    }

    @Override
    public void scanLuggage(String passengerName) {
        System.out.println("Luggage scanned for: " + passengerName);
    }

    @Override
    public void verifyPassport(String passportNo) {
        if (isPassportNumberValid(passportNo)) {
            System.out.println("Passport verified: " + passportNo);
        } else {
            System.out.println("Invalid passport: " + passportNo);
        }
    }

    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
}

public class AirportSecuritySystem {
    public static void main(String[] args) {
        String[] passengers = {"Alice", "Bob"};
        String[] passports = {"AB123456", "C123"};
        
        AirportSecurityManager manager = new AirportSecurityManager();
        manager.displaySecurityGuidelines();
        
        for (int i = 0; i < passengers.length; i++) {
            manager.scanLuggage(passengers[i]);
            manager.verifyPassport(passports[i]);
        }
    }
}