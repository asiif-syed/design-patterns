package ChainOfResponsibility;

public class ErrorLogger extends LogHandler{

    @Override
    public void log(String message, LogLevel level) {
        try{
            if(level == LogLevel.ERROR){
                System.out.println("ERROR Logger: " + message);
            } else {
                throw new Exception("Invalid log level");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
