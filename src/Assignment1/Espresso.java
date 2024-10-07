package Assignment1;

public class Espresso extends Coffee {
    IngredientFactory ingredientFactory;

    public Espresso(IngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        name = "Эспрессо";
    }

    @Override
    void prepare() {
        System.out.println("Готовим " + name);
        coffeeBase = ingredientFactory.createCoffeeBase();
        if (coffeeBase != null) coffeeBase.addCoffeeBase();
    }
}

