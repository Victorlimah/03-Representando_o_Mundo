import java.util.ArrayList;

public class Course {
    
    private String name;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Course(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public ArrayList<String> getStudents() {
        ArrayList<String> studentsName = new ArrayList<String>();
        for (Student student : students) {
            studentsName.add(student.getName());
        }
        return studentsName;
    }

    @Override
    public String toString() {
        return name + ", with teacher: " + teacher.getName();
    }
}
