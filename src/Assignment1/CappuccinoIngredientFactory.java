package Assignment1;

public class CappuccinoIngredientFactory implements IngredientFactory {
    @Override
    public CoffeeBase createCoffeeBase() {
        return new EspressoBase();
    }

    @Override
    public Milk createMilk() {
        return new FoamedMilk();
    }

    @Override
    public Additives createAdditives() {
        return null; // Без добавок
    }
}
