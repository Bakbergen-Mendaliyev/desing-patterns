package Builder;

public class SpicyPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public SpicyPizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public void buildDough() {
        pizza.setDough("тонкое тесто");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("острый соус");
    }

    @Override
    public void buildTopping() {
        pizza.setTopping("пепперони и перец чили");
    }

    @Override
    public Pizza getPizza() {
        return pizza;
    }
}
