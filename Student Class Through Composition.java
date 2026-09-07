class Student1 {
    String name;

    public Student1(String n) {
        this.name = n;
    }

    public void show() {
        System.out.println("Student: " + name);
    }
}

class University {
    Student1 student;   // University HAS-A Student

    University(String name) {
        student = new Student1(name);
    }

    void showStudent() {
        student.show();
    }
}

public class Main {
    public static void main(String[] args) {
        University u = new University("Ubaid");
        u.showStudent();
    }
}