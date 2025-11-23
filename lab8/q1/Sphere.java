package q1;
public class Sphere extends ThreeDShape {
    private double radius;

    public Sphere(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double area() {
        // Surface area of sphere = 4πr²
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        // Volume of sphere = (4/3)πr³
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radius: " + radius;
    }
}
