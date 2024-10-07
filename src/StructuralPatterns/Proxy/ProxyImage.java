package StructuralPatterns.Proxy;

/**
 * Класс ProxyImage служит заместителем для реального изображения.
 * Он загружает изображение с диска только при первом обращении к методу display().
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // Загружаем изображение только по необходимости (ленивая загрузка)
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();  // Делегируем реальную работу объекту RealImage
    }
}
