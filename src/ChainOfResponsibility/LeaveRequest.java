package ChainOfResponsibility;

public class LeaveRequest {
    private String employeeName;
    private int numberOfDays;
    private String reason;

    public LeaveRequest(String name, int days, String reason){
        this.employeeName = name;
        this.numberOfDays = days;
        this.reason = reason;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }
    public String getReason(){
        return this.reason;
    }
    public int getNumberOfDays(){
        return this.numberOfDays;
    }
}
