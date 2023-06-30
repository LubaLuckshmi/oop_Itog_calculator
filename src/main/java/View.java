import calculator.Calculable;
import calculator.CalculableFactory;
import calculator.ComplexNumber;

import java.util.Scanner;

public class View {
    private final CalculableFactory calculableFactory;

    public View(CalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public void run() {
        System.out.println("Калькулятор комплексных чисел.");
        Calculable calculable = calculableFactory.create(getArgument());
        while (true) {
            String input = prompt("Введите команду (*, +, -, /, =) : ");
            switch (input) {
                case "+":
                    calculable.sum(getArgument());
                    break;
                case "*":
                    calculable.multi(getArgument());
                    break;
                case "-":
                    calculable.subtract(getArgument());
                    break;
                case "/":
                    calculable.divide(getArgument());
                    break;
                case "=":
                    System.out.println("Результат: " + calculable.getResult());
                    String nextCircle = prompt("Еще посчитать (Y/N)?");
                    if (nextCircle.equalsIgnoreCase("n")) {
                        return;
                    } else {
                        calculable = calculableFactory.create(getArgument());
                    }
                    break;
                default:
                    System.out.println(input + " - операция не поддерживается");
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private ComplexNumber getArgument() {
        String input = "";
        input = prompt("Введите комплексное число: ");
        while (!input.matches("^[\\d]+[-+]\\d+[i]$")) {
            input = prompt(input + " - не комплексное число, введите комплексное число: ");
        }
        String[] arrayStr = input.split("[-+]");
        String a = arrayStr[0];
        String sign = arrayStr[0].endsWith(" ") ? arrayStr[1] : arrayStr[0];
        String b = arrayStr[1].split("[i]")[0];
        int imaginaryPart = sign.equals("-") ? -Integer.parseInt(b) : Integer.parseInt(b);
        return new ComplexNumber(Integer.parseInt(a), imaginaryPart);
    }
}