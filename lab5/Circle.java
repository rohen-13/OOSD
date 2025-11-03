
public class Circle extends Point 
{
    //Variables
    private double radius;

    //Constructor
    public Circle(double radius, double x, double y)
    {
        super(x, y);
        setRadius(radius);
    }
    //Getters & Setters
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    //toString
    public String toString()
    {
        return super.toString() + ", Radius= " + radius;
    }
}
