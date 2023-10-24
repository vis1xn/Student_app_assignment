package ie.atu;

public class Student {
    String Name;
    String  Email;
    String Course;

    public Student(String name, String email, String course) {
        Name = name;
        Email = email;
        Course = course;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getCourse() {
        return Course;
    }

    public void setCourse(String course) {
        Course = course;
    }
}
