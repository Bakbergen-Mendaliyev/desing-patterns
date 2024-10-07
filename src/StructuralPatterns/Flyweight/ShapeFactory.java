package StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс ShapeFactory управляет созданием и хранением объектов Flyweight (кругов).
 * Он гарантирует, что каждый круг создаётся только один раз для каждого цвета.
 */
public class ShapeFactory {
    private static final Map<String, Shape> circleMap = new HashMap<>();

    /**
     * Метод getCircle проверяет, существует ли круг с данным цветом.
     * Если нет, то он создаёт новый объект и сохраняет его для повторного использования.
     * @param color - цвет круга
     * @return объект Circle
     */
    public static Shape getCircle(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}

