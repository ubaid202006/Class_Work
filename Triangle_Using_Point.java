class Point {

    private int x;
    private int y;

    // Default Constructor
    public Point() {
        x = 0;
        y = 0;
    }

    // Parameterized Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Copy Constructor
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
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

    // toString
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Triangle {

    // Only Point Objects
    private Point p1;
    private Point p2;
    private Point p3;

    // Object Count
    private static int objectCount = 0;


    // Default Constructor
    public Triangle() {

        p1 = new Point();
        p2 = new Point();
        p3 = new Point();

        objectCount++;
    }


    // Parameterized Constructor
    public Triangle(Point p1, Point p2, Point p3) {

        this.p1 = new Point(p1);
        this.p2 = new Point(p2);
        this.p3 = new Point(p3);

        objectCount++;
    }


    // Copy Constructor
    public Triangle(Triangle t) {

        this.p1 = new Point(t.p1);
        this.p2 = new Point(t.p2);
        this.p3 = new Point(t.p3);

        objectCount++;
    }


    // Display
    public void display() {

        System.out.println("Triangle Points:");

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Point 3: " + p3);
    }


    // toString
    public String toString() {

        return "Triangle Points: "
                + p1 + ", "
                + p2 + ", "
                + p3;
    }


    // Object Count
    public static int getObjectCount() {

        return objectCount;
    }


    // Main Method
    public static void main(String[] args) {

        Triangle t3 = new Triangle();
        t3.display();

        // Creating Point Objects
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(2, 3);


        // Creating Triangle using Points
        Triangle t1 = new Triangle(p1, p2, p3);


        // Display
        t1.display();


        System.out.println("\n----------------");


        // Copy Constructor
        Triangle t2 = new Triangle(t1);

        System.out.println("Copied Triangle:");
        System.out.println(t2);


        System.out.println("\n----------------");


        // Object Count
        System.out.println("Total Triangle Objects: "
                + Triangle.getObjectCount());
    }
}
