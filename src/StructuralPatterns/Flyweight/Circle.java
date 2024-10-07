package StructuralPatterns.Flyweight;

/**
 * Класс Circle представляет конкретную фигуру (круг).
 * Он реализует интерфейс Shape и использует цвет как внутреннее состояние.
 */
public class Circle implements Shape {
    private String color;  // Внутреннее состояние (общая характеристика)

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int radius) {
        // Внешнее состояние: x, y, радиус
        System.out.println("Drawing Circle [Color: " + color + ", x: " + x + ", y: " + y + ", radius: " + radius + "]");
    }
}
