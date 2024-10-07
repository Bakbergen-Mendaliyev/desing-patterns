package StructuralPatterns.Decorator;

/**
 * Класс SportsCar добавляет спортивные возможности к базовому автомобилю.
 */
public class SportsCar extends CarDecorator {
    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.print(" Adding features of Sports Car.");
    }
}
