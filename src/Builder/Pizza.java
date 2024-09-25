package Builder;

public class Pizza {
    private String dough;
    private String sauce;
    private String topping;

    // Сеттеры
    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    // Метод для отображения состава пиццы
    public void showIngredients() {
        System.out.println("Пицца с тестом: " + dough + ", соусом: " + sauce + ", начинкой: " + topping);
    }
}
