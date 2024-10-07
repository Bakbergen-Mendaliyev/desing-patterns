package Assignment2.Decorator;

import Assignment2.Document;

// Декоратор для добавления водяного знака к документу
public class WatermarkDecorator extends DocumentDecorator {
    public WatermarkDecorator(Document decoratedDocument) {
        super(decoratedDocument);
    }

    // TODO: Реализовать добавление водяного знака
    @Override
    public void display() {
        // TODO: Отобразить документ
        super.display();
        // TODO: Добавить сообщение о добавлении водяного знака
        System.out.println("Adding watermark to document.");
    }
}

