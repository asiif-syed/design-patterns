package ChainOfResponsibility;

public class Supervisor extends Approver{
    private static final int MAX_DAYS = 2;

    public Supervisor(Approver nextApprover){
        super.setNextApprover(nextApprover);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getNumberOfDays() <= MAX_DAYS){
            System.out.println("Approved by supervisor");
        }else {
            if(nextApprover != null){
                nextApprover.handleRequest(request);
            }
        }
    }
}
