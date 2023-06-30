package calculator;

public class Calculator implements Calculable{
    private final ComplexNumber complexNumber;

    public Calculator(ComplexNumber complexNumber) {
        this.complexNumber = complexNumber;
    }
    @Override
    public Calculable sum(ComplexNumber arg) {
        int a = complexNumber.getReal() + arg.getReal();
        int b = complexNumber.getImaginary() + arg.getImaginary();
        complexNumber.setReal(a);
        complexNumber.setImaginary(b);
        return this;
    }


    @Override
    public Calculable multi(ComplexNumber arg) {
        int a = (complexNumber.getReal() * arg.getReal()) - (complexNumber.getImaginary() * arg.getImaginary());
        int b = (complexNumber.getReal() * arg.getImaginary()) + (complexNumber.getImaginary() * arg.getReal());
        complexNumber.setReal(a);
        complexNumber.setImaginary(b);
        return this;
    }

    @Override
    public Calculable subtract(ComplexNumber arg) {
        int a = complexNumber.getReal() - arg.getReal();
        int b = complexNumber.getImaginary() - arg.getImaginary();
        complexNumber.setReal(a);
        complexNumber.setImaginary(b);
        return this;
    }

    @Override
    public Calculable divide(ComplexNumber arg) {
        int divisor = (int) (Math.pow(arg.getReal(), 2) + Math.pow(arg.getImaginary(), 2));
        int a = ((complexNumber.getReal() * arg.getReal()) + (complexNumber.getImaginary() * arg.getImaginary())) / divisor;
        int b = ((complexNumber.getImaginary() * arg.getReal()) - (complexNumber.getReal() * complexNumber.getImaginary())) / divisor;
        complexNumber.setReal(a);
        complexNumber.setImaginary(b);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        return complexNumber;
    }
}
