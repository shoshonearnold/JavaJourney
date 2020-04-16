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

    public double add(double real, double imaginary) {
        return (this.real) + (this.imaginary);
    }

    public double add(double ComplexNumber) {
        return this.imaginary + ComplexNumber;
    }

    public double subtract(double real, double imaginary) {
        return (this.real) - (this.imaginary);
    }

    public double subtract(ComplexNumber other) {

    }
}
