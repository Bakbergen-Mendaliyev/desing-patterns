package Assignment2.Proxy;

import Assignment2.Document;
import Assignment2.RealDocument;

// Proxy для ленивой загрузки документа
public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String title;

    public ProxyDocument(String title) {
        this.title = title;
    }

    // ЗАДАНИЕ: Реализовать ленивую загрузку
    @Override
    public void display() {
        // TODO: Если документ не загружен, загрузить его
        if (realDocument == null) {
            System.out.println("Lazy loading document...");
            realDocument = new RealDocument(title);
        }
        // TODO: Отобразить документ
        realDocument.display();
    }
}

