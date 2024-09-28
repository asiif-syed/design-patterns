package ChainOfResponsibility;

public class Logger {
    LogHandler logger;
    public Logger(){
        LogHandler errorLogger = new ErrorLogger();
        LogHandler debugLogger = new DebugLogger(errorLogger);
        LogHandler infoLogger = new InfoLogger(debugLogger);
        this.logger = infoLogger;
    }

    public void log(String message, LogLevel level){
        this.logger.log(message, level);
    }
}
