package calculator;

public class ComplexNumber {

    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setImaginary(int imaginary) {
        this.imaginary = imaginary;
    }

    public void setReal(int real) {
        this.real = real;
    }

    @Override
    public String toString() {
        String sign = (imaginary < 0) ? "-" : "+";
        int absImaginary = Math.abs(imaginary);

        return String.format("%d%s%di", real, sign, absImaginary);
    }

}
