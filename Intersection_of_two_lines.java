class Point {

    private double x;
    private double y;

    // Constructor
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // toString
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}


class line {

    public static void main(String[] args) {

        // Line 1 points
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);

        // Line 2 points
        Point p3 = new Point(0, 4);
        Point p4 = new Point(4, 0);

        // Slopes
        double m1 = (p2.getY() - p1.getY())
                  / (p2.getX() - p1.getX());

        double m2 = (p4.getY() - p3.getY())
                  / (p4.getX() - p3.getX());

        // Y-intercepts
        double b1 = p1.getY() - m1 * p1.getX();
        double b2 = p3.getY() - m2 * p3.getX();

        // Intersection
        double x = (b2 - b1) / (m1 - m2);
        double y = m1 * x + b1;

        // Create intersection Point
        Point intersection = new Point(x, y);

        System.out.println("Intersection Point: " + intersection);
    }
}
