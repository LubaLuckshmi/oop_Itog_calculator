package calculator;

public interface Calculable {

    Calculable sum(ComplexNumber arg);

    Calculable multi(ComplexNumber arg);

    Calculable subtract(ComplexNumber arg);

    Calculable divide(ComplexNumber arg);

    ComplexNumber getResult();
}
