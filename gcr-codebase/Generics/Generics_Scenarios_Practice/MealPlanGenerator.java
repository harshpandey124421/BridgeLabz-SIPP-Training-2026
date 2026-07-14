// Subtopic: Generics - Personalized Meal Plan Generator
interface MealPlan {
    String getDetails();
}

class VegetarianMeal implements MealPlan {
    public String getDetails() { return "Vegetarian Plan"; }
}

class VeganMeal implements MealPlan {
    public String getDetails() { return "Vegan Plan"; }
}

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) { this.plan = plan; }
    public T getPlan() { return plan; }
}

public class MealPlanGenerator {
    public static <T extends MealPlan> void generatePlan(T plan) {
        System.out.println("Generated: " + plan.getDetails());
    }
}