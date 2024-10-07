package StructuralPatterns.Decorator;

/**
 * Абстрактный класс CarDecorator служит обёрткой для объектов Car.
 * Он делегирует выполнение методов базовому автомобилю.
 */
public abstract class CarDecorator implements Car {
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}

