package Assignment1;

public class EspressoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        IngredientFactory ingredientFactory = new EspressoIngredientFactory();
        return new Espresso(ingredientFactory);
    }
}
