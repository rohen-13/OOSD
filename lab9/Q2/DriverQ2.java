package Q2;

public class DriverQ2
{
    static void main()
    {
        Car car = new Car("Toyota", 4,5,20000);
        Hgv hgv = new Hgv(1000,6 ,2 ,50000);

        System.out.println("Car type: " + car.getType());
        System.out.println("Car price: $" + car.getPrice());
        System.out.println("Car import duty: " + car.calculateDuty());

        System.out.println("\nHGV cargo: " + hgv.getCargo() + " kg");
        System.out.println("HGV price: " + hgv.getPrice());
        System.out.println("HGV import duty: " + hgv.calculateDuty());
    }
}
