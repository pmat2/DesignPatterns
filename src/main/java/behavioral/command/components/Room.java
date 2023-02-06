package behavioral.command.components;

import behavioral.command.commands.Command;

public class Room {
    Command command;

    public Room() {
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
