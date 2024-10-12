package Command;

public class DecreaseTempCommand implements Command{
    private  AirConditioner ac;

    public DecreaseTempCommand(AirConditioner ac){
        this.ac  = ac;
    }

    @Override
    public void execute() {
        this.ac.reduceTemp();
    }
}
