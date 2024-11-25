package ChainResponsiblity;

public abstract class LogProcessor {
    public static final String INFO="INFO";
    public static final String DEBUG="DEBUG";
    public static final String ERROR="ERROR";


    LogProcessor logProcessor;
    LogProcessor(LogProcessor logProcessor) {
        this.logProcessor = logProcessor;
    }

    public void log(String errorLevel,String message) {
        if (logProcessor != null) {
            logProcessor.log(errorLevel, message);
        }
        else{
            System.out.println("Cannot Find");
        }
    }

}
