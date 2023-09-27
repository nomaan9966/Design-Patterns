package patterns.chainOfResponsibilty;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel == ERROR) {
            System.out.println("Error : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}
