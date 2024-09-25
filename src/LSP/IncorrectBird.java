package LSP;

// Liskov Substitution Principle (Принцип подстановки Барбары Лисков)
class IncorrectBird {
    public void fly() {
        System.out.println("Flying high!");
    }
}

// Класс Penguin, наследует Bird
class IncorrectPenguin extends IncorrectBird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly!");
    }
}

