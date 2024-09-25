package LSP;

// Класс LSP.FlyingBird для летающих птиц
public class FlyingBird extends Bird {
    @Override
    public void move() {
        fly();
    }

    public void fly() {
        System.out.println("Flying high!");
    }
}