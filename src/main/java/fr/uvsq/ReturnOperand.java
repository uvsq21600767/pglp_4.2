package fr.uvsq;

import java.util.Stack;

public class ReturnOperand implements Command {

    private MoteurRPN moteur;

    ReturnOperand(MoteurRPN moteur) {
        this.moteur = moteur;
    }

    public void apply() {
        System.out.println(this.moteur.operand);
    }
}
