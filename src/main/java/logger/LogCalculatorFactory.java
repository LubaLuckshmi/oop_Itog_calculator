package logger;

import calculator.Calculable;
import calculator.CalculableFactory;
import calculator.ComplexNumber;

public class LogCalculatorFactory implements CalculableFactory {
    Logger logger;
    public LogCalculatorFactory(Logger logger) {
        this.logger = logger;
    }


    @Override
    public Calculable create(ComplexNumber arg) {
        return new LogCalculator(arg, logger);
    }
}
