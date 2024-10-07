package StructuralPatterns.Decorator;

/**
 * Класс LuxuryCar добавляет роскошные возможности к базовому автомобилю.
 */
public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Luxury Car.");
    }
}
