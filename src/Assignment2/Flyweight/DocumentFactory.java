package Assignment2;

import java.util.HashMap;
import java.util.Map;

// Фабрика для создания и переиспользования документов
public class DocumentFactory {
    private static final Map<String, Document> documentMap = new HashMap<>();

    // TODO: Реализовать кэширование документов
    public static Document getDocument(String title) {
        // TODO: Если документ уже создан, вернуть его
        Document document = documentMap.get(title);
        if (document == null) {
            // TODO: Если документа нет, создать его через Proxy
            document = new ProxyDocument(title);
            documentMap.put(title, document);
            System.out.println("Creating new document: " + title);
        } else {
            System.out.println("Reusing existing document: " + title);
        }
        return document;
    }
}

