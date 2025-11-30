package Q2;

public class Car extends RoadVehicle implements ImportDuty{
    private String carType;
    private double price;

    public Car() {
        this("", 0, 0, 0.0);
    }

    public Car(String c, int w, int p, double price) {
        super(w, p);
        setType(c);
        this.price = price;
    }

    public void setType(String t)  {
        carType = t;
    }

    public String getType() {
        return carType;
    }
    public void setPrice(double p) {
        price = p;
    }
    public double getPrice() {
        return price;
    }

    public double calculateDuty() {
        return price * CARTAXRATE;
    }
}