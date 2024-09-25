package SRP;

// Single Responsibility Principle (Принцип единственной ответственности)
class IncorrectInvoice {
    private double amount;

    public IncorrectInvoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotal() {
        // Логика расчета суммы счета
        return amount;
    }

    public void saveToDatabase() {
        // Логика сохранения счета в базу данных
        System.out.println("Saving invoice to database...");
    }

    public void sendEmail() {
        // Логика отправки счета по email
        System.out.println("Sending invoice via email...");
    }
}