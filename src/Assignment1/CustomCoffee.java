package Assignment1;

public class CustomCoffee extends Coffee {
    public CustomCoffee(String name, CoffeeBase coffeeBase, Milk milk, Additives additives) {
        this.name = name;
        this.coffeeBase = coffeeBase;
        this.milk = milk;
        this.additives = additives;
    }

    @Override
    void prepare() {
        System.out.println("Готовим кастомный кофе: " + name);
        if (coffeeBase != null) coffeeBase.addCoffeeBase();
        if (milk != null) milk.addMilk();
        if (additives != null) additives.addAdditives();
    }
}
