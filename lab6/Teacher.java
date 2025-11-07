import java.util.Arrays;

public class Teacher extends Person
{
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 30;

    public Teacher(String name, String address)
    {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }

    public boolean addCourse(String course)
    {
        for(int i = 0; i < numCourses; i++)
        {
            if(courses[i].equals(course))
            {
                return false;
            }

        }
        courses[numCourses] = course;
        numCourses++;
        return true;
    }

    public boolean  removeCourse(String course)
    {
        int courseIndex = numCourses;
        for (int i = 0; i < numCourses; i++)
        {
            if (courses[i].equals(course))
            {
                courseIndex = i;
                break;
            }
        }
        if (courseIndex == numCourses)
        {
            return false;
        }
        else
        {
            for (int i = courseIndex; i < numCourses; i++)
            {
                courses[i] = courses[i + 1];
                return true;
            }
            numCourses--;
            return true;
        }
    }

    public String toString() {
        return "Teacher " + getName() + "(" + getAddress() + ") teaches "
                + Arrays.toString(Arrays.copyOf(courses, numCourses));
    }
}
