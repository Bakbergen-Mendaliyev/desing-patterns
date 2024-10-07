package Assignment2;

// Абстрактный декоратор для добавления функциональности документам
public abstract class DocumentDecorator implements Document {
    protected Document decoratedDocument;

    public DocumentDecorator(Document decoratedDocument) {
        this.decoratedDocument = decoratedDocument;
    }

    @Override
    public void display() {
        // TODO: Отобразить базовый документ
        decoratedDocument.display();
    }
}

