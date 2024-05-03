import java.util.ArrayList;
import java.util.List;

public class Instructor extends User{
    List<Student> students;
    public Instructor(String userName, String password) {
        super(userName, password, "1");
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }
    public void printStudents()
    {
        for(Student student : students)
        {
            System.out.println("-" + student.getUserName());
        }
    }
}
