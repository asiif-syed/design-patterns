package Command;

public class AcOnCommand implements Command{
    private AirConditioner ac;
    public AcOnCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute(){
        ac.turnOn();
    }
}
