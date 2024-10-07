package StructuralPatterns.Facade;

/**
 * Класс ComputerFacade предоставляет упрощённый интерфейс для работы с компьютером.
 * Он координирует взаимодействие с процессором, памятью и жестким диском.
 */
public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    /**
     * Метод для запуска компьютера. Он использует все компоненты системы.
     */
    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Computer successfully started.");
    }
}

