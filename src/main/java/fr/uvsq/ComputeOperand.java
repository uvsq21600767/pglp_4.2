package fr.uvsq;

import java.util.Stack;

public class ComputeOperand implements Command {

    private MoteurRPN moteur;
    private Operation operation;

    ComputeOperand(MoteurRPN moteur, Operation operation) {
        this.moteur = moteur;
        this.operation = operation;
    }

    public void apply() throws DivideZeroException {
        this.moteur.history = (Stack<Double>) this.moteur.operand.clone();
        this.moteur.operand.push(operation.eval(this.moteur.operand.pop(), this.moteur.operand.pop()));
    }
}
