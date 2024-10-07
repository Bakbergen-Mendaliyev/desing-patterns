package Assignment1;

public class EspressoIngredientFactory implements IngredientFactory {
    @Override
    public CoffeeBase createCoffeeBase() {
        return new EspressoBase();
    }

    @Override
    public Milk createMilk() {
        return null; // Эспрессо без молока
    }

    @Override
    public Additives createAdditives() {
        return null; // Без добавок
    }
}
