public class Triangle {

    // Attributes
    private double sideA;
    private double sideB;
    private double sideC;

    // Object Count
    private static int objectCount = 0;


    // 1. Default Constructor
    public Triangle() {
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
        objectCount++;
    }


    // 2. Parameterized Constructor
    public Triangle(double sideA, double sideB, double sideC) {

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;

        objectCount++;
    }


    // 3. Copy Constructor
    public Triangle(Triangle t) {

        this.sideA = t.sideA;
        this.sideB = t.sideB;
        this.sideC = t.sideC;

        objectCount++;
    }


    // 4. Equilateral Triangle Constructor
    public Triangle(double side) {

        this.sideA = side;
        this.sideB = side;
        this.sideC = side;

        objectCount++;
    }


    // 5. Isosceles Triangle Constructor
    public Triangle(double equalSide, double baseSide) {

        this.sideA = equalSide;
        this.sideB = equalSide;
        this.sideC = baseSide;

        objectCount++;
    }


    // Getters
    public double getSideA() {
        return this.sideA;
    }

    public double getSideB() {
        return this.sideB;
    }

    public double getSideC() {
        return this.sideC;
    }


    // Setters
    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    // Display
    public void display() {

        System.out.println("Side A: " + sideA);
        System.out.println("Side B: " + sideB);
        System.out.println("Side C: " + sideC);
    }


    // toString
    public String toString() {

        return "Triangle Sides: " + sideA + ", " + sideB + ", " + sideC;
    }


    // Object Count
    public static int getObjectCount() {

        return objectCount;
    }


    // Main Method
    public static void main(String[] args) {

        // Default Triangle
        Triangle t1 = new Triangle();

        System.out.println("Default Triangle:");
        t1.display();


        System.out.println("\n----------------");


        // Normal Triangle
        Triangle t2 = new Triangle(3, 4, 5);

        System.out.println("Normal Triangle:");
        t2.display();


        System.out.println("\n----------------");


        // Equilateral Triangle
        Triangle t3 = new Triangle(5);

        System.out.println("Equilateral Triangle:");
        t3.display();


        System.out.println("\n----------------");


        // Isosceles Triangle
        Triangle t4 = new Triangle(5, 3);

        System.out.println("Isosceles Triangle:");
        t4.display();


        System.out.println("\n----------------");


        // Copy Constructor
        Triangle t5 = new Triangle(t2);

        System.out.println("Copy Triangle:");
        System.out.println(t5);


        System.out.println("\n----------------");


        // Object Count
        System.out.println("Total Objects: "
                + Triangle.getObjectCount());
    }
}
