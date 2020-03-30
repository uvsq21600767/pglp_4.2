package fr.uvsq;

public class Undo implements Command {

    private Interpreteur interpreteur;

    Undo(Interpreteur interpreteur) {
        this.interpreteur = interpreteur;
    }

    public void apply() {
        this.interpreteur.undo();
    }
}
