package AbstractFactory;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Отметка чекбокса MacOS.");
    }
}
