public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Welcome to the school system!\n");

        Teacher t1 = new Teacher("123", "Diego Pinho");
        Teacher t2 = new Teacher("123", "Bruna Hamori");
        Teacher t3 = new Teacher("123", "Frank Rocha");

        Course c1 = new Course("Desenvolvimento Fullstack", t1);
        Course c2 = new Course("Soft Skills e Carreirras", t2);
        Course c3 = new Course("Aceleração Java", t3);

        Student s1 = new Student("Devinho", "123");
        Student s2 = new Student("Devão", "123");
        Student s3 = new Student("Devaldo", "123");

        System.out.println("Courses available: ");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());

        System.out.println("\nStudents in course: " + c1.getName());
        System.out.println(c1.getStudents());

        System.out.println("\nOh no! No students in this course yet! Go and add Devinho here!");
        c1.addStudent(s1);

        System.out.println("\nStudents in course: " + c1.getName() );
        System.out.println(c1.getStudents());
        System.out.println("\nYes! Now we have Devinho in this course! Let's add Devão and Devaldo here!");

        c1.addStudent(s2);
        c1.addStudent(s3);

        System.out.println("\nStudents in course: " + c1.getName());
        System.out.println(c1.getStudents());

        System.out.println("\nNow we have all students in this course!");
    }
}
