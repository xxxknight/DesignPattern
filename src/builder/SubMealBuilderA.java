package builder;

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("food A");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("drink A");
    }
}