package Command;

public class AcOffCommand implements Command{
    private AirConditioner ac;

    public AcOffCommand(AirConditioner ac){
        this.ac = ac;
    }

    @Override
    public void execute() {
        this.ac.turnOff();
    }
}
