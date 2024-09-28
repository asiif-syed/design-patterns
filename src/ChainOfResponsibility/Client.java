package ChainOfResponsibility;

public class Client {
    public static void main(String[] args){
//        LeaveRequest request1 = new LeaveRequest("Asif", 2, "Personal");
//        LeaveRequest request2 = new LeaveRequest("Asif", 5, "Sick");
//        LeaveRequest request3 = new LeaveRequest("Asif", 10, "Vacation");
//
//        LeaveApprover approver = new LeaveApprover();
//        approver.apply(request1);
//        approver.apply(request2);
//        approver.apply(request3);

        Logger logger = new Logger();
        logger.log("Your system is up and running!", LogLevel.INFO);
        logger.log("Your token is going to expire soon!", LogLevel.DEBUG);
        logger.log("Something went wrong!", LogLevel.ERROR);
    }
}
