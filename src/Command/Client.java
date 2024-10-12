package Command;

public class Client {
    public static void main(String[] args){
        AirConditioner ac = new AirConditioner(16, 32, 22);
        Command turnAcOn = new AcOnCommand(ac);
        Command turnAcOff = new AcOffCommand(ac);
        Command increaseAcTemp = new IncreaseTempCommand(ac);
        Command decreaseAcTemp = new DecreaseTempCommand(ac);


        Remote remoteControl = new Remote();
        remoteControl.setCommand(RemoteCommands.Turn_On, turnAcOn);
        remoteControl.setCommand(RemoteCommands.Turn_Off, turnAcOff);
        remoteControl.setCommand(RemoteCommands.Increase_Temp, increaseAcTemp);
        remoteControl.setCommand(RemoteCommands.Decrease_Temp, decreaseAcTemp);

        remoteControl.pressButton(RemoteCommands.Turn_On);
        remoteControl.pressButton(RemoteCommands.Turn_On);
        remoteControl.pressButton(RemoteCommands.Increase_Temp);
        remoteControl.pressButton(RemoteCommands.Increase_Temp);
        remoteControl.pressButton(RemoteCommands.Increase_Temp);
        remoteControl.pressButton(RemoteCommands.Decrease_Temp);
        remoteControl.pressButton(RemoteCommands.Turn_Off);
        remoteControl.pressButton(RemoteCommands.Turn_Off);
        remoteControl.pressButton(RemoteCommands.Increase_Temp);
        remoteControl.pressButton(RemoteCommands.Increase_Temp);
        remoteControl.pressButton(RemoteCommands.Increase_Temp);
        remoteControl.pressButton(RemoteCommands.Decrease_Temp);
    }
}
