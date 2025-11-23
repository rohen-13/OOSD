package q1;
public class Circle1 extends Shape {
    private double radius;

    public Circle1(String name, String color, double radius)
    {
        super(name, color);
        this.radius = radius;
    }
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return super.toString() + ", Radius : " + radius;
    }
}