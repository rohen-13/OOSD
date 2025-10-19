public class Address {
    //Variables
    private String city;
    private String street;
    private String county;

//Constructor
    public Address(String city, String street, String county)
    {
        setCity(city);
        setStreet(street);
        setCounty(county);
    }


//Getters & Setters
    public String getStreet()
    {
        return street;
    }
    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCounty()
    {
        return county;
    }
    public void setCounty(String county)
    {
        this.county = county;
    }

    public String getCity()
    {
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    //toString

    @Override
    public String toString() {
        return "Address{" + "city=" + city + ", street=" + street + ", county=" + county + '}';
    }
}
