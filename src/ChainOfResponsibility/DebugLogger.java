package ChainOfResponsibility;

public class DebugLogger extends LogHandler{

    public DebugLogger(LogHandler nextLogger){
        super.setNextHandler(nextLogger);
    }
    @Override
    public void log(String message, LogLevel level) {
        if(level == LogLevel.DEBUG){
            System.out.println("DEBUG Logger: " + message);
        }else{
            nextHandler.log(message, level);
        }
    }
}
