package fr.uvsq;

import java.util.Stack;

public class SaveOperand implements Command {

    private MoteurRPN moteur;
    private double operand;

    SaveOperand(MoteurRPN moteur, double operand) {
        this.moteur = moteur;
        this.operand = operand;
    }

    public void apply() {
        this.moteur.history = (Stack<Double>) this.moteur.operand.clone();
        this.moteur.operand.push(operand);
    }

    public void setOperand(double operand) {
        this.operand = operand;
    }
}
