// Topic: Constructors - Circle Class Constructor Chaining
public class CircleConstructors {
    double radius;

    public CircleConstructors() {
        this(1.0); 
    }

    public CircleConstructors(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        CircleConstructors c1 = new CircleConstructors();
        CircleConstructors c2 = new CircleConstructors(5.5);
    }
}