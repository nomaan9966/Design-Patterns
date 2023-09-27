package patterns.chainOfResponsibilty;

public class LogProcessor {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    private final LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;
    }

    public void log(int logLevel, String message) {
        if (nextLogProcessor != null)
            nextLogProcessor.log(logLevel, message);
    }
}
