package ChainOfResponsibility;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover){
        this.nextApprover = nextApprover;
    }
    public abstract  void handleRequest(LeaveRequest request);
}
