// Topic: Constructors - Person Class Copy Constructor
public class PersonCopyConstructor {
    String name;
    int age;

    public PersonCopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public PersonCopyConstructor(PersonCopyConstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        PersonCopyConstructor p1 = new PersonCopyConstructor("Alice", 30);
        PersonCopyConstructor p2 = new PersonCopyConstructor(p1);
    }
}