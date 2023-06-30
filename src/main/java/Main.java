import logger.LogCalculatorFactory;
import logger.Logger;
import logger.LoggerFile;

public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerFile();
        LogCalculatorFactory logCanCalculateFactory = new LogCalculatorFactory(logger);
        View consoleView = new View(logCanCalculateFactory);
        consoleView.run();
    }
}
