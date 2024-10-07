package Assignment1;

// CoffeeOrder.java
public class CoffeeOrder implements Cloneable {
    private Coffee coffee;

    public CoffeeOrder(Coffee coffee) {
        this.coffee = coffee;
    }

    public void prepare() {
        coffee.prepare();
    }

    @Override
    public CoffeeOrder clone() {
        try {
            CoffeeOrder clone = (CoffeeOrder) super.clone();
            clone.coffee = this.coffee.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return coffee.toString();
    }
}
