package behavioral.command;

import behavioral.command.commands.SwitchLightsCommand;
import behavioral.command.components.Light;
import behavioral.command.components.Room;

public class Impl {

    public void doSth(){
        Room room = new Room();
        room.setCommand(
                new SwitchLightsCommand(new Light())
        );
        room.executeCommand();
    }

}
