package Assignment1;

public class LatteFactory extends CoffeeFactory {
    @Override
    public Coffee createCoffee() {
        IngredientFactory ingredientFactory = new LatteIngredientFactory();
        return new Latte(ingredientFactory);
    }
}
