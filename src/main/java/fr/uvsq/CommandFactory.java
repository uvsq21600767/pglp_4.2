package fr.uvsq;

import java.util.HashMap;

public class CommandFactory {

    private final HashMap<String, Command> commandMap;

    CommandFactory() {
        this.commandMap = new HashMap<>();
    }

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) throws UnknownCommandException {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new UnknownCommandException();
        }
        command.apply();
    }
}
