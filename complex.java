class Complex {

    private int real;
    private int imaginary;


    // Default Constructor
    public Complex() {
        real = 0;
        imaginary = 0;
    }


    // Parameterized Constructor
    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    // Copy Constructor
    public Complex(Complex c) {
        this.real = c.real;
        this.imaginary = c.imaginary;
    }


    // Addition
    public Complex add(Complex c) {

        Complex result = new Complex();

        result.real = this.real + c.real;
        result.imaginary = this.imaginary + c.imaginary;

        return result;
    }


    // Subtraction
    public Complex subtract(Complex c) {

        Complex result = new Complex();

        result.real = this.real - c.real;
        result.imaginary = this.imaginary - c.imaginary;

        return result;
    }


    // toString
    public String toString() {

        return real + " + " + imaginary + "i";
    }

    public static void main(String[] args) {


        // =========================
        // COMPLEX NUMBER
        // =========================

        Complex c1 = new Complex(3, 4);
        Complex c2 = new Complex(2, 5);

        System.out.println("Complex Numbers:");

        System.out.println("C1 = " + c1);
        System.out.println("C2 = " + c2);


        // Addition
        Complex Add = c1.add(c2);

        System.out.println("Addition = " + Add);


        // Subtraction
        Complex Sub = c1.subtract(c2);

        System.out.println("Subtraction = " + Sub);


        // Copy Constructor
        Complex Copy = new Complex(c1);

        System.out.println("Copy = " + Copy);
    }
}