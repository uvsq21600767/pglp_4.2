package fr.uvsq;

import java.util.Stack;

public class Interpreteur {

    public Stack<Double> operand;
    public Stack<Double> history;

    Interpreteur() {
        this.operand = new Stack<>();
        this.history = new Stack<>();
    }

    public void quit() {
        System.out.println("Exit the program");
    }

    public void undo() {
        operand = new Stack<>();
        operand = (Stack<Double>) history.clone();
    }
}
