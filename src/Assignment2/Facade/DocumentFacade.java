package Assignment2.Facade;

import Assignment2.Bridge.DocumentRenderer;
import Assignment2.Bridge.RenderEngine;
import Assignment2.Bridge.SimpleDocumentRenderer;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Document;
import Assignment2.Flyweight.DocumentFactory;

// Фасад для работы с документами
public class DocumentFacade {
    // TODO: Реализовать упрощённый интерфейс для работы с документами
    public void displayDocument(String title) {
        Document document = DocumentFactory.getDocument(title);
        // TODO: Отобразить документ через фасад
        document.display();
    }

    public void displayDocumentWithWatermark(String title) {
        Document document = DocumentFactory.getDocument(title);
        // TODO: Добавить водяной знак и отобразить документ через фасад
        Document watermarkedDocument = new WatermarkDecorator(document);
        watermarkedDocument.display();
    }

    public void renderDocument(String title, RenderEngine engine) {
        // TODO: Реализовать рендеринг документа через фасад
        DocumentRenderer renderer = new SimpleDocumentRenderer(engine);
        renderer.render(title);
    }
}

