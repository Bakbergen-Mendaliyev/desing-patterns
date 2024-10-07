package Assignment2;

import java.util.ArrayList;
import java.util.List;

// Класс для работы с группами документов (категориями)
public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    // TODO: Реализовать добавление документа в группу
    public void addDocument(Document document) {
        documents.add(document);
    }

    // TODO: Реализовать удаление документа из группы
    public void removeDocument(Document document) {
        documents.remove(document);
    }

    // TODO: Реализовать отображение всех документов в группе
    @Override
    public void display() {
        System.out.println("Displaying group of documents:");
        // TODO: Перебрать все документы и отобразить их
        for (Document document : documents) {
            document.display();
        }
    }
}

