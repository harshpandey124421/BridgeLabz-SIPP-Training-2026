// Subtopic: Scope - Local vs Instance variables
public class VariableScopeDemo {
    int instanceVar = 10;

    public void demonstrateScope() {
        int localVar = 20;
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Local Variable: " + localVar);
    }

    public static void main(String[] args) {
        VariableScopeDemo demo = new VariableScopeDemo();
        demo.demonstrateScope();
    }
}