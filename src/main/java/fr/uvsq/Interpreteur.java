package fr.uvsq;

import java.util.Stack;

public class Interpreteur {

    public Stack<Double> operand;
    public Stack<Double> hystory;

    Interpreteur() {
        this.operand = new Stack<>();
        this.hystory = new Stack<>();
    }

    public void quit() {
        System.out.println("Exit the program");
    }

    public void undo() {
        
    }
}
