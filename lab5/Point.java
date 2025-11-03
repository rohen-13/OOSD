public class Point
{
    //Variables
    private double x;
    private double y;


    //Constructor
    public Point(double x, double y)
    {
        setX(x);
        setY(y);
    }

    //Getters & Setters
    public double getX()
    {
        return x;
    }
    
    public void setX(double x)
    {
        this.x =x;
    }

    public double getY()
    {
        return y;
    }
    
    public void setY(double y)
    {
        this.y=y;
    }



    //toString
    public String toString()
    {
        return "Point coordinates: X= " + x + ", Y= " + y;
    }
}