package LSP;

// Класс LSP.Penguin для нелетающих птиц
public class Penguin extends Bird {
    @Override
    public void move() {
        walk();
    }

    public void walk() {
        System.out.println("Waddling on the ground!");
    }
}