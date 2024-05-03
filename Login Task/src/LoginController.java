import java.util.ArrayList;

public class LoginController {
    private final ArrayList<Student>students;
    private final ArrayList<Instructor>instructors;

    public LoginController(ArrayList<Student> students, ArrayList<Instructor> instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public User checkUser(String username, String password) {
        for (Instructor instructor : instructors) {
            if (instructor.getUserName().equals(username) && instructor.getPassword().equals(password)) {
                return instructor;
            }
        }

        for (Student student : students) {
            if (student.getUserName().equals(username) && student.getPassword().equals(password)) {
                return student;
            }
        }
        return null;
    }

}
