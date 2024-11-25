package ChainResponsiblity;

public class Main {
    public static void main(String[] args) {
        LogProcessor logger=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logger.log("ERROR","info is this");
        System.out.println(21321>>>4);
    }
}
