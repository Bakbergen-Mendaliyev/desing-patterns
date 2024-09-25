package AbstractFactory;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("Отметка чекбокса Windows.");
    }
}
