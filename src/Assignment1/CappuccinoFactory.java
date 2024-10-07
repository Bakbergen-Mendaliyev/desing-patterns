package Assignment1;

public class CappuccinoFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        IngredientFactory ingredientFactory = new CappuccinoIngredientFactory();
        return new Cappuccino(ingredientFactory);
    }
}
