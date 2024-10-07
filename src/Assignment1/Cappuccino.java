package Assignment1;

public class Cappuccino extends Coffee {
    IngredientFactory ingredientFactory;

    public Cappuccino(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Капучино";
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
