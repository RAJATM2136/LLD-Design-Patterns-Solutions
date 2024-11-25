package ChainResponsiblity;

public class ErrorLogProcessor extends LogProcessor{

    ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String errorLevel, String message) {
        if(errorLevel != LogProcessor.ERROR) {
            super.log(errorLevel, message);
        }
        else {
            System.out.println("Error is "+message);
        }
    }
}
