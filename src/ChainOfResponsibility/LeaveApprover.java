package ChainOfResponsibility;

public class LeaveApprover {
    Approver approver;
    public LeaveApprover(){
        Approver director = new Director();
        Approver manager = new Manager(director);
        Approver superVisor = new Supervisor(manager);
        this.approver = superVisor;
    }
    public void apply(LeaveRequest request){
        this.approver.handleRequest(request);
    }
}
