package uml;

public class Student implements LoggingStudentActivity {
    private  String name;
    private int studentID;
    private  int age;

    private Address address;

    public Student(String name, int age, int studentID) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getAge() {
        return age;
    }

    private void log(String message) {
        Logger logger = new Logger();
        logger.log(message);
    }

    public void displayStudentInf() {
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentID);
        System.out.println("Age: " + age);

    }

    @Override
    public void logStudentActivity(String message) {

    }
}
