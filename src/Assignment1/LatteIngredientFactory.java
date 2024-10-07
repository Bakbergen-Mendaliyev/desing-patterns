package Assignment1;

public class LatteIngredientFactory implements IngredientFactory {
    @Override
    public CoffeeBase createCoffeeBase() {
        return new EspressoBase();
    }

    @Override
    public Milk createMilk() {
        return new SteamedMilk();
    }

    @Override
    public Additives createAdditives() {
        return null; // Без добавок
    }
}
