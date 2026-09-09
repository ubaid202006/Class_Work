class Student implements Cloneable {

    private int id;
    private String name;
    private String department;

    // Constructor
    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // 1. equals()
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Student)) {
            return false;
        }

        Student s = (Student) obj;

        return this.id == s.id
                && this.name.equals(s.name)
                && this.department.equals(s.department);
    }

    // 2. hashCode()
    @Override
    public int hashCode() {

        return Integer.hashCode(id)
                + name.hashCode()
                + department.hashCode();
    }

    // 3. toString()
    @Override
    public String toString() {

        return "Student ID: " + id
                + ", Name: " + name
                + ", Department: " + department;
    }

    // 4. getClass()
    public void showClass() {

        System.out.println(
                "Class Name: " + this.getClass().getName()
        );
    }

    // 5. clone()
    @Override
    public Student clone() {

        try {
            return (Student) super.clone();

        } catch (CloneNotSupportedException e) {
            return null;}
    }
}

// Main class
public class method_overriding {

    public static void main(String[] args) {

        // Creating objects
        Student s1 = new Student(
                101,
                "Ali",
                "Computer Science"
        );

        Student s2 = new Student(
                101,
                "Ali",
                "Computer Science"
        );


        // equals()
        System.out.println(
                "equals(): " + s1.equals(s2)
        );


        // hashCode()
        System.out.println(
                "s1 hashCode: " + s1.hashCode()
        );

        System.out.println(
                "s2 hashCode: " + s2.hashCode()
        );


        // toString()
        System.out.println(
                "toString(): " + s1
        );


        // getClass()
        s1.showClass();


        // clone()
        Student s3 = s1.clone();

        System.out.println("Cloned Student:");

        System.out.println(s3);


        // Check cloned object
        System.out.println(
                "s1 equals s3: " + s1.equals(s3)
        );

        System.out.println(
                "s1 == s3: " + (s1 == s3)
        );

        System.out.println("Program completed.");
    }
}
