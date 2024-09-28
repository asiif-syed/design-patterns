package ChainOfResponsibility;

public abstract class LogHandler {
    protected LogHandler nextHandler;
    public void setNextHandler(LogHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    public abstract  void log(String message, LogLevel level);
}
