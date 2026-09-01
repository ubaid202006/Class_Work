public class Student {

    // Attributes
    private String name;
    private int rollNumber;
    private int age;
    private double marks;

    // Object Count
    private static int objectCount = 0;


    // Default Constructor
    public Student() {

        this.name = "";
        this.rollNumber = 0;
        this.age = 0;
        this.marks = 0;

        objectCount++;
    }


    // Parameterized Constructor
    public Student(String name, int rollNumber, int age, double marks) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
        this.marks = marks;

        objectCount++;
    }


    // Copy Constructor
    public Student(Student s) {

        this.name = s.name;
        this.rollNumber = s.rollNumber;
        this.age = s.age;
        this.marks = s.marks;

        objectCount++;
    }


    // Getters

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }


    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }


    // Unique Behaviour: Calculate Grade

    public char calculateGrade() {

        if (marks >= 80)
            return 'A';

        else if (marks >= 70)
            return 'B';

        else if (marks >= 60)
            return 'C';

        else if (marks >= 50)
            return 'D';

        else
            return 'F';
    }


    // Unique Behaviour: Pass / Fail

    public boolean isPassed() {

        return marks >= 50;
    }


    // Display

    public void display() {

        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("Passed: " + isPassed());
    }


    // toString

    public String toString() {

        return "Student: " + name + ", Roll Number: " + rollNumber + ", Age: " + age + ", Marks: " + marks;
    }

    // Object Count

    public static int getObjectCount() {

        return objectCount;
    }


    // Main Method

    public static void main(String[] args) {

        // Default Constructor
        Student s1 = new Student();

        System.out.println("Student 1:");
        s1.display();


        System.out.println("\n----------------------");


        // Parameterized Constructor
        Student s2 = new Student(
                "Ubaid",
                101,
                20,
                85
        );

        System.out.println("Student 2:");
        s2.display();


        System.out.println("\n----------------------");


        // Setter
        s2.setMarks(75);

        System.out.println("After Setter:");
        s2.display();


        System.out.println("\n----------------------");


        // Getters
        System.out.println("Using Getters:");

        System.out.println("Name: " + s2.getName());
        System.out.println("Marks: " + s2.getMarks());


        System.out.println("\n----------------------");


        // Copy Constructor
        Student s3 = new Student(s2);

        System.out.println("Student 3 (Copy):");
        System.out.println(s3);


        System.out.println("\n----------------------");


        // Object Count
        System.out.println(
                "Total Student Objects: "
                + Student.getObjectCount()
        );
    }
}
