public class Vet
{
    private String name;

    public Vet(String name)
    {
        this.name = name;
    }

    public void Vaccinate(Animal a)
    {
        System.out.println(name + " is vaccinating");
        if (a instanceof Dog)
        {
            System.out.println("Dog has been vaccinated: " + a.toString);
        }
        else if(a instanceof Cat)
        {
            System.out.println("Cat has been vaccinated: " + a.toString);
        }
    }

}