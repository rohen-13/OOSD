package q1;
public class Rectangle extends Shape
{
    private double length;
    private double width;

    public Rectangle(String name, String color, double length, double width)
    {
        super(name, color);
        this.length = length;
        this.width = width;
    }

    public double area()
    {
        return length * width;
    }

    @Override
    public String toString() {
        return super.toString() + ", Length: " + length + ", Width: " + width;
    }
}
