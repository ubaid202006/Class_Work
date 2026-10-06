import java.util.Random;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point other) {
        this.x = other.x;
        this.y = other.y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || this.getClass() != other.getClass()) return false;
        
        Point p = (Point) other;
        return this.x == p.x && this.y == p.y;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point(" + x + ", " + y + ")";
    }
}

class PointArray implements Cloneable {
    Point[] points;

    public PointArray(Point[] points) {
        this.points = points;
    }

    public Point getPoint(int index) {
        return this.points[index];
    }

    @Override
    public PointArray clone() throws CloneNotSupportedException {
        return (PointArray) super.clone();
    }

    public PointArray deepCopy() {
        Point[] newPoints = new Point[this.points.length];
        for (int i = 0; i < this.points.length; i++) {
            newPoints[i] = new Point(this.points[i]); 
        }
        return new PointArray(newPoints);
    }

    @Override
    public String toString() {
        return java.util.Arrays.toString(points);
    }
}

public class PointArrayMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        Random random = new Random();
        Point[] data = new Point[100];
        
        // Main creates the 100 Point objects; PointArray contains their references.
        for (int i = 0; i < data.length; i++) {
            int x = random.nextInt(1, 101); // generate an x range from 1 till 100
            int y = random.nextInt(1, 101); // generate an x range from 1 till 100
            data[i] = new Point(x, y);
        }
        
        PointArray original = new PointArray(data);
        PointArray shallow = original.clone();
        PointArray deep = original.deepCopy();
        
        shallow.getPoint(0).setX(999);
        System.out.println("Shallow shares data: " + (original.getPoint(0).getX() == 999));
        
        deep.getPoint(1).setY(888);
        System.out.println("Deep is independent: " + (original.getPoint(1).getY() != 888));
        
        Point p = new Point(10, 20);
        Point q = new Point(10, 20);
        System.out.println("Logical equality: " + p.equals(q));
    }
}