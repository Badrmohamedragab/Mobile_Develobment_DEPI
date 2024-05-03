import java.util.List;

public class Student extends User{
    List<Courses>courses;

    public Student(String userName, String password) {
        super(userName, password, "2");
    }

    public void setCourses(List<Courses> courses) {
        this.courses = courses;
    }

    public List<Courses> getCourses() {
        return courses;
    }
    public void printCourses()
    {
        for(Courses course : courses)
        {
            System.out.println("-"+ course.getCourseName());
        }
    }
}
