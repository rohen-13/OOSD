package q2;

public class TestPerson
{
    static void main()
    {
        Person[] people = new Person[2];
        people[0] = new Employee("Bob", 10000);
        people[1] = new Student("John", "Software Development");

        for (int i = 0; i < people.length; i++)
        {
            System.out.println(people[i].getName() + ": " + people[i].getDescription());
        }
    }
}
