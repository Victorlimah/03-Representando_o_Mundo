public class Student {
    
    private String name;
    private String registration;

    public Student(String name, String registration) {
        this.name = name;
        this.registration = registration;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }
}
