package ChainOfResponsibility;

public class Director extends Approver{
    @Override
    public void handleRequest(LeaveRequest request) {
        System.out.println("Approved by Director");
    }
}
