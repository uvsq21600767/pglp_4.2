package fr.uvsq;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SaisieRPN {

    private Scanner sc;
    private CommandFactory factory;

    SaisieRPN(MoteurRPN moteur) {
        this.sc = new Scanner(System.in);
        this.factory = new CommandFactory();
        this.factory.createCommand(moteur);
    }

    public Operation convertCharToOperation(String s) throws WrongArgumentException {
        switch(s) {
            case "+": {
                return Operation.PLUS;
            }

            case "-": {
                return Operation.MOINS;
            }

            case "/": {
                return Operation.MULT;
            }

            case "x": {
                return Operation.DIV;
            }

            default: {
                throw new WrongArgumentException();
            }
        }
    }

    public void getInput() throws DivideZeroException, WrongArgumentException {
        String in = this.sc.nextLine();

        if(Pattern.matches("[+-]?([0-9]*)", in)) {
            this.factory.saveOperand(Double.parseDouble(in));
            this.factory.execCommand("save");
        }

        if(in.equals("/") || in.equals("x") || in.equals("+") || in.equals("-")) {
            this.factory.setOperation(convertCharToOperation(in));
            this.factory.execCommand("compute");
        } else {
            this.factory.execCommand("in");
        }
    }
}
