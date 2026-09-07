import java.util.Scanner;

class Student {

    private String name;
    private int age;

    // Constructor
    Student(String name, int age) {

        // NullPointerException
        if (name == null) {
            throw new NullPointerException("Name cannot be null");
        }

        // Input Validation
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        // IllegalArgumentException
        if (age < 18) {
            throw new IllegalArgumentException(
                "Age must be 18 or above"
            );
        }

        this.name = name;
        this.age = age;
    }

    // Method
    void displayStudent() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Registration Successful!");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student age: ");
        int age = input.nextInt();

        try {

            // Object creation
            Student student = new Student(name, age);

            student.displayStudent();

        } 
        catch (IllegalArgumentException e) {
            System.out.println("Invalid Input: " + e.getMessage());
        } 
        catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }

        input.close();
    }
}