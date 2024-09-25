package AbstractFactory;

public class WindowsButton implements Button {
    @Override
    public void click() {
        System.out.println("Клик по кнопке Windows.");
    }
}
