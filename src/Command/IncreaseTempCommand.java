package Command;

public class IncreaseTempCommand implements Command{
    private AirConditioner ac;

    public IncreaseTempCommand(AirConditioner ac){
        this.ac  = ac;
    }

    @Override
    public void execute() {
        this.ac.increaseTemp();
    }
}
