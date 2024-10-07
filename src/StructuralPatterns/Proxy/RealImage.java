package StructuralPatterns.Proxy;

/**
 * Класс RealImage представляет реальное изображение, которое может быть загружено с диска.
 * Этот класс выполняет тяжёлую операцию загрузки изображения.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();  // Имитация тяжёлой загрузки при создании объекта
    }

    private void loadFromDisk() {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
}

