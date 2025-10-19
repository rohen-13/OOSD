public class Employee
{
    //Variables
    private String FirstName;
    private String LastName;
    private Address address;
    private static int nextstaffnumber=1000;
    private int employeeNumber;
    private String employeeType;
    private String comCarType;
    //Constructor
    public Employee(String FirstName, String LastName, Address address, String employeeType)
    {
        setEmployeeNumber(nextstaffnumber);
        setFirstName(FirstName);
        setLastName(LastName);
        setAddress(address);
        setEmployeeType(employeeType);
        nextstaffnumber++;
    }
    //Getters & Setters
    public String getFirstName()
    {
        return FirstName;
    }
    public void setFirstName(String FirstName)
    {
        this.FirstName = FirstName;
    }

    public String getLastName()
    {
        return LastName;
    }
    public void setLastName(String LastName)
    {
        this.LastName = LastName;
    }

    public Address getAddress()
    {
        return address;
    }
    public  void setAddress(Address address)
    {
        this.address = address;
    }
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
    public String getEmployeeType()
    {
        return employeeType;
    }
    public void setEmployeeType(String employeeType)
    {
        this.employeeType = employeeType;
    }
    public String getComCarType()
    {
        return comCarType;
    }
    public void setComCarType(String comCarType)
    {
        this.comCarType = comCarType;
    }
    public static int noOfEmplyee()
    {
        return nextstaffnumber-1000;
    }

    //toString
    public String toString()
    {
        if (employeeType.equalsIgnoreCase("Manager"))
        {
            return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + address + "EmployeeNumber=" + employeeNumber + ", employeeType=" + employeeType + ", comCarType=" + comCarType + "]";
        }
        else
        {
            return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + ", Address=" + address + "EmployeeNumber=" + employeeNumber + ", employeeType=" + employeeType;
        }

    }
}




