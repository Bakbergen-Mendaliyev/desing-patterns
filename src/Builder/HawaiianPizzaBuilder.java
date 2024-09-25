package Builder;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("мягкое тесто");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("сладкий соус");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("ветчина и ананас");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
