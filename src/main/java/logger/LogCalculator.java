package logger;

import calculator.Calculable;
import calculator.Calculator;
import calculator.ComplexNumber;

public class LogCalculator implements Calculable {
    Calculator calculator;
    Logger logger;
    public LogCalculator(ComplexNumber arg, Logger logger) {
        this.calculator = new Calculator(arg);
        this.logger = logger;
        logger.log("first argument - " + arg + '\n');
    }

    @Override
    public Calculable sum(ComplexNumber arg) {
        logger.log("sum " + arg + '\n');
        calculator.sum(arg);
        return this;
    }

    @Override
    public Calculable multi(ComplexNumber arg) {
        logger.log("multiply " + arg + '\n');
        calculator.multi(arg);
        return this;
    }

    @Override
    public Calculable subtract(ComplexNumber arg) {
        logger.log("subtract " + arg + '\n');
        calculator.subtract(arg);
        return this;
    }

    @Override
    public Calculable divide(ComplexNumber arg) {
        logger.log("divide " + arg + '\n');
        calculator.divide(arg);
        return this;
    }

    @Override
    public ComplexNumber getResult() {
        ComplexNumber result = calculator.getResult();
        logger.log("Result: " + result + '\n');
        return result;
    }
}
