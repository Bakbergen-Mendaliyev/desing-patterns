package DIP;

// Класс высокого уровня
public class Computer {
    private HardDrive hardDrive = new HardDrive();

    public String getData() {
        return hardDrive.readData();
    }
}
