class Vector {

    // Attributes
    private double x;
    private double y;

    // Object Count
    private static int objectCount = 0;


    // Default Constructor
    public Vector() {
        x = 0;
        y = 0;

        objectCount++;
    }


    // Parameterized Constructor
    public Vector(double x, double y) {
        this.x = x;
        this.y = y;

        objectCount++;
    }


    // Copy Constructor
    public Vector(Vector v) {
        this.x = v.x;
        this.y = v.y;

        objectCount++;
    }


    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    // Setters
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    // Vector Addition
    public Vector add(Vector v) {

        return new Vector(
                this.x + v.x,
                this.y + v.y
        );
    }


    // Vector Subtraction
    public Vector subtract(Vector v) {

        return new Vector(
                this.x - v.x,
                this.y - v.y
        );
    }


    // Scalar Multiplication
    public Vector multiply(double number) {

        return new Vector(
                this.x * number,
                this.y * number
        );
    }


    // Magnitude
    public double magnitude() {

        return Math.sqrt(this.x * this.x + this.y * this.y);
    }


    // Dot Product
    public double dotProduct(Vector v) {

        return this.x * v.x + this.y * v.y;
    }


    // Display
    public void display() {

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }


    // toString
    public String toString() {

        return "(" + x + ", " + y + ")";
    }


    // Object Count
    public static int getObjectCount() {

        return objectCount;
    }


    // Main Method
    public static void main(String[] args) {

        // Default Constructor
        Vector v1 = new Vector();

        System.out.println("Vector 1:");
        v1.display();


        System.out.println("\n----------------------");


        // Parameterized Constructor
        Vector v2 = new Vector(4, 5);

        System.out.println("Vector 2:");
        System.out.println(v2);


        System.out.println("\n----------------------");


        // Setters
        v2.setX(4);
        v2.setY(5);

        System.out.println("After Setter:");
        System.out.println(v2);


        System.out.println("\n----------------------");


        // Getters
        System.out.println("Using Getters:");

        System.out.println("X = " + v2.getX());
        System.out.println("Y = " + v2.getY());


        System.out.println("\n----------------------");


        // Another Vector
        Vector v3 = new Vector(2, 3);


        // Addition
        Vector addition = v2.add(v3);

        System.out.println("Vector Addition:");
        System.out.println(addition);


        System.out.println("\n----------------------");


        // Subtraction
        Vector subtraction = v2.subtract(v3);

        System.out.println("Vector Subtraction:");
        System.out.println(subtraction);


        System.out.println("\n----------------------");


        // Scalar Multiplication
        Vector multiplication = v2.multiply(5);

        System.out.println("Scalar Multiplication:");
        System.out.println(multiplication);


        System.out.println("\n----------------------");


        // Magnitude
        System.out.println("Magnitude:");

        System.out.println(v2.magnitude());


        System.out.println("\n----------------------");


        // Dot Product
        System.out.println("Dot Product:");

        System.out.println(v2.dotProduct(v3));


        System.out.println("\n----------------------");


        // Copy Constructor
        Vector v4 = new Vector(v2);

        System.out.println("Vector 4 (Copy):");
        System.out.println(v4);


        System.out.println("\n----------------------");


        // Object Count
        System.out.println("Total Vector Objects: "
                + Vector.getObjectCount());
    }
}
