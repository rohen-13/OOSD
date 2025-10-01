package lab2b_q2;
public class RectangleQ2
{
    //Variables
    private float width;
    private float length;
    private float area;
    private float perimeter;

    //Constructor
    public RectangleQ2()
    {
        width = 1;
        length = 1;
    }

    //Getters & Setters

    public void setLength(float length)
    {
        if(length > 0.0 && length < 40.0)
        {
            this.length = length;
        }
        else
        {
            System.out.println("Invalid length");
        }
    }

    public void setWidth(float width)
    {
        if(width > 0.0 && width < 40.0)
        {
            this.width = width;
        }
        else
        {
            System.out.println("Invalid width");
        }

    }
    public float getWidth()
    {
        return width;
    }
    public float getLength()
    {
        return length;
    }

    public float getArea()
    {
        area = length * width;
        return area;
    }
    public float getPerimeter()
    {
        perimeter = (length + width) * 2;
        return perimeter;
    }
    //toString

    public String toString()
    {
        return "Length = " + length + ", Width = " + width + "\n";
    }
}