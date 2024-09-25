package ISP;

interface IncorrectDevice {
    void print();
    void scan();
    void fax();
}

class IncorrectPrinter implements IncorrectDevice {
    @Override
    public void print() {
        System.out.println("Printing document");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Fax not supported");
    }
}

class IncorrectScanner implements IncorrectDevice {
    @Override
    public void print() {
        throw new UnsupportedOperationException("Print not supported");
    }

    @Override
    public void scan() {
        System.out.println("Scanning document");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Fax not supported");
    }
}

