package fr.uvsq;

public class WrongArgumentException extends CalculatriceException {

    WrongArgumentException() {
        super("Must be 2 operator (+, -, /, x)\n");
    }
}
