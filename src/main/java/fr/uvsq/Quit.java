package fr.uvsq;

public class Quit implements Command {

    private Interpreteur interpreteur;

    Quit(Interpreteur interpreteur) {
        this.interpreteur = interpreteur;
    }

    public void apply() {
        this.interpreteur.quit();
    }
}
