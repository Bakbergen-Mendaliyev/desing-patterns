package Assignment1;

public abstract class Coffee implements Cloneable {
    String name;
    CoffeeBase coffeeBase;
    Milk milk;
    Additives additives;

    abstract void prepare();

    @Override
    public Coffee clone() {
        try {
            return (Coffee) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
