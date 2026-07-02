// Topic: Classes and Objects - Level 1: Compute Area of a Circle
public class CircleArea {
    private double radius;

    public CircleArea(double radius) {
        this.radius = radius;
    }

    public void calculateAndDisplay() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area: " + area + ", Circumference: " + circumference);
    }

    public static void main(String[] args) {
        CircleArea circle = new CircleArea(5.0);
        circle.calculateAndDisplay();
    }
}