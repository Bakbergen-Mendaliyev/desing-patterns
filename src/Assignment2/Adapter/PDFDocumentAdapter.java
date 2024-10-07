package Assignment2;

// Адаптер для интеграции PDF документа
public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String fileName) {
        this.pdfDocument = new PDFDocument(fileName);
    }

    @Override
    public void display() {
        // TODO: Открыть и отобразить PDF документ через адаптер
        pdfDocument.openPDF();
        pdfDocument.showPDF();
    }
}

