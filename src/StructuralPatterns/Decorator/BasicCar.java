package StructuralPatterns.Decorator;

/**
 * Класс BasicCar реализует интерфейс Car, представляя базовый автомобиль.
 */
public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }
}

