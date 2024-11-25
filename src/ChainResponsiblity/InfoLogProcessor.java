package ChainResponsiblity;

public class InfoLogProcessor extends LogProcessor{

    InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    public void log(String errorLevel, String message) {
        if(errorLevel !=LogProcessor.INFO) {
            super.log(errorLevel, message);
        }
        else {
            System.out.println("Info is "+message);
        }
    }
}
