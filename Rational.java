public class Rational {

    private int numerator;
    private int denominator;


    // Default Constructor
    public Rational() {
        numerator = 0;
        denominator = 1;
    }


    // Parameterized Constructor
    public Rational(int numerator, int denominator) {

        this.numerator = numerator;

        if (denominator != 0) {
            this.denominator = denominator;
        } 
        else {
            this.denominator = 1;
        }
    }


    // Copy Constructor
    public Rational(Rational r) {

        this.numerator = r.numerator;
        this.denominator = r.denominator;
    }


    // Addition
    public Rational add(Rational r) {

        Rational result = new Rational();

        result.numerator =
                (this.numerator * r.denominator)
                + (r.numerator * this.denominator);

        result.denominator =
                this.denominator * r.denominator;

        return result;
    }


    // Subtraction
    public Rational subtract(Rational r) {

        Rational result = new Rational();

        result.numerator =
                (this.numerator * r.denominator)
                - (r.numerator * this.denominator);

        result.denominator =
                this.denominator * r.denominator;

        return result;
    }


    // toString
    public String toString() {

        return numerator + "/" + denominator;
    }


    // Display
    public void display() {

        System.out.println(toString());
    }
 {
    
}
    public static void main(String[] args) {
        // =========================
        // RATIONAL NUMBER
        // =========================

        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, 3);

        System.out.println("\nRational Numbers:");

        System.out.println("R1 = " + r1);
        System.out.println("R2 = " + r2);


        // Addition
        Rational rAdd = r1.add(r2);

        System.out.println("Addition = " + rAdd);


        // Subtraction
        Rational rSub = r1.subtract(r2);

        System.out.println("Subtraction = " + rSub);


        // Copy Constructor
        Rational rCopy = new Rational(r1);

        System.out.println("Copy = " + rCopy);
    }
}