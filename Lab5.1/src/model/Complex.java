package model;

public class Complex {
    private double real;
    private double imaginar;

    public Complex(double real, double imaginar) {
        this.real = real;
        this.imaginar = imaginar;
    }

    public double getReal() {
        return real;
    }

    public double getImaginar() {
        return imaginar;
    }
    
    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginar(double imaginar) {
        this.imaginar = imaginar;
    }

    public Complex adunare(Complex c) {
        return new Complex(this.real + c.real, this.imaginar + c.imaginar);
    }

    public Complex scadere(Complex c) {
        return new Complex(this.real - c.real, this.imaginar - c.imaginar);
    }

    public Complex inmultire(Complex c) {
        double realRezultat = this.real * c.real - this.imaginar * c.imaginar;
        double imaginarRezultat = this.real * c.imaginar + this.imaginar * c.real;
        return new Complex(realRezultat, imaginarRezultat);
    }

    public Complex inmultireCuScalar(double scalar) {
        return new Complex(this.real * scalar, this.imaginar * scalar);
    }

    @Override
    public String toString() {
        return real + " + " + imaginar + "i";
    }
}
