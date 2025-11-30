package Q2;

public class Hgv extends RoadVehicle implements ImportDuty{
    private int cargo;
    private double price;

    public Hgv(){
        this(0,0,0, 0.0);
    }

    public Hgv(int c, int w, int p, double price){
        super(w, p);
        setCargo(c);
        this.price = price;
    }

    public void setCargo(int size){
        cargo = size;
    }

    public int getCargo(){
        return cargo;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice()
    {
        return price;
    }

    public double calculateDuty() {
        return price * HGVTAXRATE;
    }
}
