class Point {

    // Attributes
    private int x;
    private int y;

    // Object Count
    private static int objectCount = 0;

    // Default / Null Constructor
    public Point() {

        this.x = 0;
        this.y = 0;

        objectCount++;
    }

    // Parameterized Constructor
    public Point(int x, int y) {

        this.x = x;
        this.y = y;

        objectCount++;
    }

    // Copy Constructor
    public Point(Point p) {

        this.x = p.x;
        this.y = p.y;

        objectCount++;
    }

    // Getters

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Setters

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    // Point Addition

    public Point add(Point p) {

        Point result = new Point();

        result.x = this.x + p.x;
        result.y = this.y + p.y;

        return result;
    }

    // Point Subtraction

    public Point subtract(Point p) {

        Point result = new Point();

        result.x = this.x - p.x;
        result.y = this.y - p.y;

        return result;
    }

    // Display

    public void display() {

        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }


    // toString()

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
        Point p1 = new Point();

        System.out.println("Point 1:");
        p1.display();


        System.out.println("\n----------------------");


        // Parameterized Constructor
        Point p2 = new Point(10, 20);

        System.out.println("Point 2:");
        p2.display();


        System.out.println("\n----------------------");


        // Setters
        p2.setX(15);
        p2.setY(25);

        System.out.println("After Setter:");
        p2.display();


        System.out.println("\n----------------------");


        // Getters
        System.out.println("Using Getters:");

        System.out.println("X = " + p2.getX());
        System.out.println("Y = " + p2.getY());


        System.out.println("\n----------------------");


        // Another Point
        Point p3 = new Point(5, 10);


        // Addition
        Point p4 = p2.add(p3);

        System.out.println("Point Addition:");
        System.out.println(p4);


        System.out.println("\n----------------------");


        // Subtraction
        Point p5 = p2.subtract(p3);

        System.out.println("Point Subtraction:");
        System.out.println(p5);


        System.out.println("\n----------------------");


        // Copy Constructor
        Point p6 = new Point(p2);

        System.out.println("Point 6 (Copy):");
        System.out.println(p6);


        System.out.println("\n----------------------");


        // toString()
        System.out.println("Using toString():");
        System.out.println(p2.toString());


        System.out.println("\n----------------------");


        // Object Count
        System.out.println("Total Point Objects: "
                + Point.getObjectCount());
    }
}