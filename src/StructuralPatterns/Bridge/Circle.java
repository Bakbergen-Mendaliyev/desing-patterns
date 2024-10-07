package StructuralPatterns.Bridge;

/**
 * Класс Circle расширяет абстракцию Shape и использует интерфейс DrawAPI для рисования.
 */
public class Circle extends Shape {
    private int x, y, radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y); // Отрисовка через реализацию DrawAPI
    }
}
