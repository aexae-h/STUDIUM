package ws20.aufgabe1_2_4_6_Eisenbahnzug;

import java.util.Random;

import static jsTools.Graph.*;

class Wagon {
    Random random = new Random();

    Wagon next;

    private static int lfdNr = 0;
    private int wagonNr;

    private String[] colors = {"red", "green", "blue", "yellow", "gray", "brown", "cyan", "pink"};
    private String col;

    final int heightWagon = 20;
    int lengthWagon;

    // Konstruktor
    Wagon() {
        this.lengthWagon = random.nextInt(100) + 20;
        wagonNr = lfdNr++;
        col = colors[random.nextInt(colors.length)];
        next = null;
    }

    // prüfen ob ein Wagon einen Next hat.
    boolean hasNext() {
        return next != null;
    }

    // Alle Wagen rekursiv zeichnen
    void paint(int posx, int posy) {
        sleep(400);
        addRect(posx, posy, lengthWagon, heightWagon, col, "" + wagonNr);
        if (!hasNext()) {
            return;
        }
        next.paint(posx + lengthWagon + 5, posy);
    }

    public int getWagonNr() {
        return wagonNr;
    }

    @Override
    public String toString() {
        return "Wagon{}" + getWagonNr();
    }
}

