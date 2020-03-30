package fr.uvsq;

public class EmptyStackException extends CalculatriceException {

    EmptyStackException() {
        super("Stack is empty\n");
    }
}
