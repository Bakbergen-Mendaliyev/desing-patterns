package FactoryMethod;

public abstract class ShapeFactory {
    // Абстрактный метод createShape() вынужден быть реализован в каждом конкретном подклассе.
    // Этот метод отвечает за создание объектов типа Shape,
    // однако сам ShapeFactory не знает заранее, какой именно объект будет создан.
    public abstract Shape createShape();

    // Метод drawShape() вызывает фабричный метод createShape(),
    // чтобы получить конкретный объект типа Shape,
    // а затем вызывает метод draw() для этого объекта, чтобы его нарисовать.
    public void drawShape() {
        Shape shape = createShape();
        shape.draw();
    }
}
