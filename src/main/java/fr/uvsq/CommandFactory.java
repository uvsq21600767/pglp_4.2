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

    public void execute(String commandName) throws UnknownCommandException, DivideZeroException {
        Command command = commandMap.get(commandName);
        if (command == null) {
            throw new UnknownCommandException();
        }
        command.apply();
    }

    public void saveOperand(Double operand) {
        SaveOperand s;
        s = (SaveOperand) this.commandMap.get("save");
        s.setOperand(operand);
    }

    public void setOperation(Operation operation) {
        ComputeOperand c;
        c = (ComputeOperand) this.commandMap.get("compute");
        c.setOperation(operation);
    }

    public void execCommand(String s) throws DivideZeroException {
        this.commandMap.get(s).apply();
    }

    public void createCommand(MoteurRPN moteur) {
        this.register("undo", new Undo(moteur));
        this.register("quit", new Quit(moteur));
        this.register("compute", new ComputeOperand(moteur, Operation.PLUS));
        this.register("save", new SaveOperand(moteur, 0.0));
        this.register("return", new ReturnOperand(moteur));
    }
}
