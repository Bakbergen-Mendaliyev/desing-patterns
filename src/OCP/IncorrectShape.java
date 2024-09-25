package OCP;

// Open/Closed Principle (Принцип открытости/закрытости)
public class IncorrectShape {
    public String type;
    public double radius;
    public double width;
    public double height;

    public IncorrectShape(String type, double radius, double width, double height) {
        this.type = type;
        this.radius = radius;
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        if (type.equals("circle")) {
            return Math.PI * radius * radius;
        } else if (type.equals("rectangle")) {
            return width * height;
        }
        return 0;
    }
}

