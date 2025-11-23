package q1;
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String name, String color, double base, double height) {
        super(name, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return super.toString() + ", Base: " + base + ", Height: " + height;
    }
}
