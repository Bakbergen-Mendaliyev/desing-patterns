package SRP;

public class Invoice {
    private double amount;

    public Invoice(double amount) {
        this.amount = amount;
    }

    public double calculateTotal() {
        // Логика расчета суммы счета
        return amount;
    }

    public double getAmount() {
        return amount;
    }
}