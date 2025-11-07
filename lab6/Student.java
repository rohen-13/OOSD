import java.util.Arrays;

public class Student extends Person
{
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    public  Student(String name, String address)
    {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    public void addCourseGrade(String course, int grade)
    {
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }

    public void printGrades()
    {
        System.out.print("Student: " + getName() + "(" + getAddress() + ") ");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ":" + grades[i] + " ");
        }
        System.out.println();
    }

    public double getAverageGrade()
    {
        double avg = 0;
        for (int i = 0; i < numCourses; i++)
        {
            avg += grades[i];
        }
        return avg / numCourses;
    }

    public String toString()
    {
        return "Student [numCourses= " + numCourses + ", courses=" + Arrays.toString(courses) + ", grades=" + Arrays.toString(grades) + "]";
    }
}
