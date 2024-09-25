package ISP;

class PrinterOnly implements Printer {
    @Override
    public void print() {
        System.out.println("Printing document");
    }
}

