package lab2b_q3;
public class RectangleQ3
{
    //Variables
    private float width;
    private float length;
    private int index;
    private int j;
    private int x;

    //Constructor
    public RectangleQ3()
    {
        width = 10;
        length = 4;
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

    public void printRectangle()
    {   
        String topAndBottom ="*";
        for(index = 0; index < width-1; index++)
        {
           topAndBottom+="*"; 
        }
        System.out.println(topAndBottom);

        for(j=0; j < length-2; j++)
        {
            System.out.print("*");
            for(x=0; x < width-2; x++)
            {
                System.out.print(" ");
            }
             System.out.println("*");
        }
         System.out.print(topAndBottom);
        

    }
    //toString

    public String toString()
    {
        return "Length = " + length + ", Width = " + width + "\n";
    }
}