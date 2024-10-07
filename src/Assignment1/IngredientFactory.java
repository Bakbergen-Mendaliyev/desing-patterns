package Assignment1;

public interface IngredientFactory {
    CoffeeBase createCoffeeBase();
    Milk createMilk();
    Additives createAdditives();
}
