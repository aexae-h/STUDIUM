package ws20.aufgabe20_Taschenrechner;

public interface Operation {
    int func(int x1, int x2);
}

class Addition implements Operation {
    public int func(int x1, int x2) {
        return x1 + x2;
    }
}

class Subtraktion implements Operation {
    public int func(int x1, int x2) {
        return x1 - x2;
    }
}

class Multiplikation implements Operation {
    public int func(int x1, int x2) {
        return x1 * x2;
    }
}

class Division implements Operation {
    public int func(int x1, int x2) {
        if(x2 == 0){
            throw new IllegalArgumentException("Keine Nulldivison erlaubt!");
        }
        return x1 / x2;
    }
}

