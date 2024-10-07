package Assignment1;

public class CustomCoffeeBuilder {
    private String name;
    private CoffeeBase coffeeBase;
    private Milk milk;
    private Additives additives;

    public CustomCoffeeBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public CustomCoffeeBuilder setCoffeeBase(CoffeeBase coffeeBase) {
        this.coffeeBase = coffeeBase;
        return this;
    }

    public CustomCoffeeBuilder setMilk(Milk milk) {
        this.milk = milk;
        return this;
    }

    public CustomCoffeeBuilder setAdditives(Additives additives) {
        this.additives = additives;
        return this;
    }

    public CustomCoffee build() {
        return new CustomCoffee(name, coffeeBase, milk, additives);
    }
}
