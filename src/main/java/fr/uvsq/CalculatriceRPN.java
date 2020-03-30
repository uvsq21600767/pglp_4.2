package fr.uvsq;

public enum CalculatriceRPN {
    CALCULATRICE_RPN() {
        public void exec() throws DivideZeroException, WrongArgumentException {
            MoteurRPN moteur = new MoteurRPN();
            SaisieRPN saisie = new SaisieRPN(moteur);
            while(true) {
                saisie.getInput();
            }
        }
    };

    public abstract void exec() throws DivideZeroException, WrongArgumentException;

    public static void main(String[] args) throws DivideZeroException, WrongArgumentException {
        CALCULATRICE_RPN.exec();
    }
}
