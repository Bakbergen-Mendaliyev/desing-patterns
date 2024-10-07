package Assignment1;

public class Latte extends Coffee {
    IngredientFactory ingredientFactory;

    public Latte(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Латте";
    }

    @Override
    void prepare() {
        System.out.println("Готовим " + name);
        coffeeBase = ingredientFactory.createCoffeeBase();
        milk = ingredientFactory.createMilk();
        if (coffeeBase != null) coffeeBase.addCoffeeBase();
        if (milk != null) milk.addMilk();
    }
}
