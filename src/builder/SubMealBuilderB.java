package builder;

public class SubMealBuilderB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("food B");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("drink B");
    }
}