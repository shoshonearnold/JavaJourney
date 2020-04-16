package repository4.Challenges.ComplexOperations;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    //"add parameters to fields" means literally add the add parameters to the INITIALIZED instance variables
    public void add(double real,double imaginary) {
        this.real += real; // parameters to fields: +=
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber other) {
        add(other.real,other.imaginary);
    }

    /*
    "subtract parameters from fields" means literally subtract the subtract parameters
    from the INITIALIZED instance variables
     */
    public void subtract(double real,double imaginary) {
        this.real -= real; // parameters to fields: -=
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber other) {
        subtract(other.real,other.imaginary);
    }

    public static void main(String[] args) {
        ComplexNumber complexNumber = new ComplexNumber(1.0,-2.0);
        System.out.println(complexNumber.getReal() + complexNumber.getImaginary());
        System.out.println(complexNumber.getReal() - complexNumber.getImaginary());
    }
}
