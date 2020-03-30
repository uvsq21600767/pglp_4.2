package fr.uvsq;

public class DivideZeroException extends CalculatriceException {
    DivideZeroException() {
        super("You can't divide by 0\n");
    }
}
