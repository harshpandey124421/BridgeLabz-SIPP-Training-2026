import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class Q1_AddressBookApp {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> nameMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    static void addContact(String name, String phone, String email) {
        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number. Contact not added: " + name);
            return;
        }
        Contact c = new Contact(name, phone, email);
        contacts.add(c);
        nameMap.put(name, c);
        phoneNumbers.add(phone);
        System.out.println("Contact added: " + name);
    }

    static void searchContact(String name) {
        Contact c = nameMap.get(name);
        if (c != null) {
            System.out.println(c.name + " " + c.phone + " " + c.email);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    static void deleteContact(String name) {
        Contact c = nameMap.get(name);
        if (c != null) {
            contacts.remove(c);
            nameMap.remove(name);
            phoneNumbers.remove(c.phone);
            System.out.println("Contact deleted: " + name);
        } else {
            System.out.println("Contact not found: " + name);
        }
    }

    static void displaySorted() {
        ArrayList<Contact> sortedList = new ArrayList<>(contacts);
        Collections.sort(sortedList, new Comparator<Contact>() {
            public int compare(Contact a, Contact b) {
                return a.name.compareTo(b.name);
            }
        });
        for (Contact c : sortedList) {
            System.out.println(c.name + " " + c.phone + " " + c.email);
        }
    }

    public static void main(String[] args) {
        addContact("Harsh", "9876543210", "harsh@gmail.com");
        addContact("Amit", "9123456780", "amit@gmail.com");
        addContact("Neha", "9988776655", "neha@gmail.com");
        addContact("Duplicate", "9876543210", "dup@gmail.com");

        System.out.println();
        searchContact("Amit");
        searchContact("Rahul");

        System.out.println();
        deleteContact("Neha");

        System.out.println();
        System.out.println("All Contacts Sorted By Name:");
        displaySorted();
    }
}
