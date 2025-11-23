package q1;
public class Cylinder extends ThreeDShape{
    private double height;
    private double radius;

    public Cylinder(String name, String color, double radius, double height)
    {
        super(name,color);
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(double h){
        height = h;
    }

    public double getHeight(){
        return height;
    }

    public double area(){
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}