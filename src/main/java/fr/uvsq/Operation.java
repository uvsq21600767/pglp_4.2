package fr.uvsq;

public enum Operation {
    PLUS('+')
            {
                public double eval(double a, double b)
                {
                    return a+b;
                }
            },
    MOINS('-')
            {
                public double eval(double a, double b)
                {
                    return a-b;
                }
            },
    MULT('x')
            {
                public double eval(double a, double b)
                {
                    return a*b;
                }
            },
    DIV('/')
            {
                public double eval(double a, double b) throws DivideZeroException
                {
                    if(b==0) throw new DivideZeroException();
                    return a/b;
                }
            };

    private char symbole;

    Operation(char c)
    {
        this.symbole = c;
    }

    public abstract double eval(double a, double b) throws DivideZeroException;
}
