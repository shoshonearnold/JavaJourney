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

    public void add(double ComplexNumber) {
        this.imaginary += ComplexNumber;
        add(this.real,this.imaginary);
    }

    //"add parameters to fields" means literally add the add parameters to the INITIALIZED instance variables
    public void subtract(double real,double imaginary) {
        this.real -= real; // parameters to fields: -=
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber other) {
        subtract(this.real,this.imaginary);
    }
}
