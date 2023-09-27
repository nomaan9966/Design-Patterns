package patterns.chainOfResponsibilty;

import java.util.HashMap;

public class DebugLogProcessor extends LogProcessor{
    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        if (logLevel == DEBUG) {
            System.out.println("Debug : " + message);
        } else {
            super.log(logLevel, message);
        }
    }
}