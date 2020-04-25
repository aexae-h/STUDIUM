package ws20.aufgabe17_Additionstabelle;

interface Funktion {
    public double f(double x1, double x2);
}

class Addition implements Funktion {
    @Override
    public double f(double x1, double x2) {
        return x1 + x2;
    }
}

class Subtraktion implements Funktion {
    @Override
    public double f(double x1, double x2) {
        return x1 - x2;
    }
}

class Multiplikation implements Funktion {
    @Override
    public double f(double x1, double x2) {
        return x1 * x2;
    }
}

class Division implements Funktion {
    @Override
    public double f(double x1, double x2) {
        return (double) Math.round((x1/x2) * 100) / 100;
    }
}

