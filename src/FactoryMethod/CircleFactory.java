package FactoryMethod;

public class CircleFactory extends ShapeFactory {
    // Есть два конкретных фабричных класса — SquareFactory и CircleFactory.
    // Они наследуют абстрактный класс ShapeFactory и реализуют метод createShape(),
    // возвращая конкретные фигуры — квадрат (Square) и круг (Circle) соответственно.
    @Override
    public Shape createShape() {
        return new Circle();
    }
}
