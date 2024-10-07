package Assignment2;

// Представляет сторонний формат PDF документа
public class PDFDocument {
    private String fileName;

    public PDFDocument(String fileName) {
        this.fileName = fileName;
    }

    // TODO: Открыть PDF документ
    public void openPDF() {
        System.out.println("Opening PDF document: " + fileName);
    }

    // TODO: Показать содержимое PDF документа
    public void showPDF() {
        System.out.println("Displaying PDF content: " + fileName);
    }
}

