package Command;

import java.util.HashMap;

public class Remote {
    private HashMap<RemoteCommands, Command> commands;

    public Remote(){
        this.commands = new HashMap<RemoteCommands, Command>();
    }

    public void setCommand(RemoteCommands name, Command command){
        this.commands.put(name, command);
    }

    public void pressButton(RemoteCommands name){
        Command selectedCommand = this.commands.get(name);
        if(selectedCommand != null){
            selectedCommand.execute();
        } else {
            System.out.println("Unknown Command: " + name);
        }
    }
}
