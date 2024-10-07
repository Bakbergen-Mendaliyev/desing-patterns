package StructuralPatterns.Bridge;

/**
 * Абстрактный класс Shape, который содержит ссылку на интерфейс DrawAPI.
 * Определяет общие для всех фигур методы.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
