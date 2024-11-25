package ChainResponsiblity;

public class DebugLogProcessor extends LogProcessor{

    DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String errorLevel, String message) {
        if(errorLevel != LogProcessor.DEBUG) {
            super.log(errorLevel, message);
        }
        else {
            System.out.println("Debug is "+message);
        }
    }
}
