package ws20.aufgabe8_Zoo;

import static jsTools.Graph.*;

public class Main {
    public static void main(String[] args) {
        initWindow();
        Schmetterling schmetterling = new Schmetterling(100, 100, 0.0001, 10, 23, 0.01);
        schmetterling.paint();
        schmetterling.fortbewegung();
        schmetterling.lieblingsbeutetier();
        schmetterling.verstaendigung();
    }
}


// Wurzel
abstract class Tier {
    protected static final int SIZEANIMALS = 48;
    int posx, posy;
    double gewicht;

    Tier(int x, int y, double g) {
        this.posx = x;
        this.posy = y;
        this.gewicht = g;
    }

    abstract void paint();
    abstract void fortbewegung();
    abstract void verstaendigung();
    abstract void lieblingsbeutetier();
}


// Unterwurzel
abstract class ueberWasser extends Tier {
    int kaefiggroesse;
    double lufttemperatur;

    ueberWasser(int x, int y, double g, int kGr, double luftTemp) {
        super(x, y, g);
        this.kaefiggroesse = kGr;
        this.lufttemperatur = luftTemp;
    }
}


// Eltern
abstract class Luftlebewesen extends ueberWasser {
    double fluegelspannweite;

    Luftlebewesen(int x, int y, double g, int kGr, double luftTemp, double fS) {
        super(x, y, g, kGr, luftTemp);
        this.fluegelspannweite = fS;
    }
}

abstract class Landlebewesen extends ueberWasser {
    // falls weitere Attribute
    Landlebewesen(int x, int y, double g, int kGr, double luftTemp) {
        super(x, y, g, kGr, luftTemp);
    }
}

abstract class Wasserlebewesen extends Tier {
    int aquariumgroesse;

    Wasserlebewesen(int x, int y, double g, int aGr) {
        super(x, y, g);
        this.aquariumgroesse = aGr;
    }
}


//Kind : Luftlebewesen
class Schmetterling extends Luftlebewesen {
    // weitere Atrribute
    Schmetterling(int x, int y, double g, int kGr, double luftTemp, double fS) {
        super(x, y, g, kGr, luftTemp, fS);
    }

    @Override
    void paint() {
        addPicture(posx, posy, SIZEANIMALS, SIZEANIMALS, "ws20/aufgabe8_Zoo/img/butterfly.png");
    }

    @Override
    void fortbewegung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und fliege!");
    }

    @Override
    void verstaendigung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und rede nicht!");
    }

    @Override
    void lieblingsbeutetier() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und habe kein Beutetier!");
    }
}


//Kind : Luftlebewesen
class Maeusebussard extends Luftlebewesen {
    // weitere Atrribute
    Maeusebussard(int x, int y, double g, int kGr, double luftTemp, double fS) {
        super(x, y, g, kGr, luftTemp, fS);
    }

    @Override
    void paint() {
        addPicture(posx, posy, SIZEANIMALS, SIZEANIMALS, "ws20/aufgabe8_Zoo/img/eagle.png");
    }

    @Override
    void fortbewegung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und fliege!");
    }

    @Override
    void verstaendigung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und kreische!");
    }

    @Override
    void lieblingsbeutetier() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und mein Bäutetier sind Mäuse!");
    }
}

//Kind : Landlebewesen
class Loewe extends Landlebewesen {
    // weitere Atrribute
    Loewe(int x, int y, double g, int kGr, double luftTemp) {
        super(x, y, g, kGr, luftTemp);
    }

    @Override
    void paint() {
        addPicture(posx, posy, SIZEANIMALS, SIZEANIMALS, "ws20/aufgabe8_Zoo/img/lion.png");
    }

    @Override
    void fortbewegung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und laufe!");
    }

    @Override
    void verstaendigung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und rawre!");
    }

    @Override
    void lieblingsbeutetier() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und esse gerne Garzellen!");
    }
}

//Kind : Landlebewesen
class Hase extends Landlebewesen {
    // weitere Atrribute
    Hase(int x, int y, double g, int kGr, double luftTemp) {
        super(x, y, g, kGr, luftTemp);
    }

    @Override
    void paint() {
        addPicture(posx, posy, SIZEANIMALS, SIZEANIMALS, "ws20/aufgabe8_Zoo/img/rabbit.png");
    }

    @Override
    void fortbewegung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und hüpfe!");
    }

    @Override
    void verstaendigung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und rede nicht!");
    }

    @Override
    void lieblingsbeutetier() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und habe kein Beutetier!");
    }
}

//Kind : Wasserlebewesen
class Hai extends Wasserlebewesen {
    // weitere Atrribute
    Hai(int x, int y, double g, int aGr) {
        super(x, y, g, aGr);
    }

    @Override
    void paint() {
        addPicture(posx, posy, SIZEANIMALS, SIZEANIMALS, "ws20/aufgabe8_Zoo/img/shark.png");
    }

    @Override
    void fortbewegung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und schwimme!");
    }

    @Override
    void verstaendigung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und rede nicht!");
    }

    @Override
    void lieblingsbeutetier() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und esse gerne andere Fische!");
    }
}

//Kind : Wasserlebewesen
class Karpfen extends Wasserlebewesen {
    // weitere Atrribute
    Karpfen(int x, int y, double g, int aGr) {
        super(x, y, g, aGr);
    }

    @Override
    void paint() {
        addPicture(posx, posy, SIZEANIMALS, SIZEANIMALS, "ws20/aufgabe8_Zoo/img/fish.png");
    }

    @Override
    void fortbewegung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und schwimme!");
    }

    @Override
    void verstaendigung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und rede nicht!");
    }

    @Override
    void lieblingsbeutetier() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und habe kein Beutetier!");
    }
}

//Kind : Landlebewesen
class Wolf extends Landlebewesen {
    // weitere Atrribute
    Wolf(int x, int y, double g, int kGr, double luftTemp) {
        super(x, y, g, kGr, luftTemp);
    }

    @Override
    void paint() {
        addPicture(posx, posy, SIZEANIMALS, SIZEANIMALS, "ws20/aufgabe8_Zoo/img/wolf.png");
    }

    @Override
    void fortbewegung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und laufe!");
    }

    @Override
    void verstaendigung() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und knurre!");
    }

    @Override
    void lieblingsbeutetier() {
        System.out.println("Ich bin ein " + getClass().getSimpleName() + " und esse gerne Hasen!");
    }
}