package patterns.chainOfResponsibilty;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "exception occurred");
        logProcessor.log(LogProcessor.DEBUG, "debug this");
        logProcessor.log(LogProcessor.INFO, "just info");
        System.out.println();
    }
}
