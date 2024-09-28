package ChainOfResponsibility;

public class InfoLogger extends LogHandler{

    public InfoLogger(LogHandler nextHandler){
        super.setNextHandler(nextHandler);
    }

    @Override
    public void log(String message, LogLevel level) {
        if(level == LogLevel.INFO){
            System.out.println("INFO Logger: " + message);
        }else{
            nextHandler.log(message, level);
        }
    }
}
