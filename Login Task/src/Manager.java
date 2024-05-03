import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
     static final ArrayList<Student> students = new ArrayList<>();
     static final ArrayList<Instructor> instructors = new ArrayList<>();
    static final ArrayList<Courses> courses = new ArrayList<>();
    public Manager()
    {
            students.add(new Student("student1", "stuPass1"));
            students.add(new Student("student2", "stuPass2"));
            students.add(new Student("student3", "stuPass3"));
            students.add(new Student("student4", "stuPass4"));
            students.add(new Student("student5", "stuPass5"));

            instructors.add(new Instructor("instructor1", "instPass1"));
            instructors.add(new Instructor("instructor2", "instPass2"));
            instructors.add(new Instructor("instructor3", "instPass3"));
            instructors.add(new Instructor("instructor4", "instPass4"));
            instructors.add(new Instructor("instructor5", "instPass5"));

            courses.add(new Courses("Java programming"));
            courses.add(new Courses("Web development"));
            courses.add(new Courses("Data science"));
            courses.add(new Courses("Machine learning"));

    }
    public void runApplication()
    {

          LoginController loginController = new LoginController(students, instructors);

          System.out.println("Welcome to the Course Center Application!");

            while(true){
                System.out.print("Enter username:");
                Scanner input = new Scanner(System.in);
                String username = input.nextLine();
                System.out.print("Enter Password:");
                String password = input.nextLine();

                User currentUser = loginController.checkUser(username, password);

                if (currentUser != null) {
                    System.out.println("Login successful!");
                    if(currentUser.getType().equals("1"))
                    {
                        Instructor instructor = (Instructor) currentUser;
                        instructor.setStudents(students);
                        instructor.printStudents();
                    }
                    else
                    {
                        Student student = (Student) currentUser;
                        student.setCourses(courses);
                        student.printCourses();
                    }
                    return;
                }
                else {
                    System.out.println("Invalid username or password, please try again.");
                }
            }

    }

}



