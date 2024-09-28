package ChainOfResponsibility;

public class Manager extends Approver{
    private static final int MAX_DAYS = 5;

    public Manager(Approver nextApprover){
        super.setNextApprover(nextApprover);
    }

    @Override
    public void handleRequest(LeaveRequest request) {
        if(request.getNumberOfDays() <= MAX_DAYS){
            System.out.println("Approved by manager");
        }else{
            if(nextApprover != null){
                nextApprover.handleRequest(request);
            }
        }
    }
}
