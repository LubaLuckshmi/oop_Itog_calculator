package calculator;

public class CalculatorFactory implements CalculableFactory{
    public Calculable create(ComplexNumber arg) {
        return new Calculator(arg);
    }
}
