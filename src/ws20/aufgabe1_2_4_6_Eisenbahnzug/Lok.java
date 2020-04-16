package ws20.aufgabe1_2_4_6_Eisenbahnzug;

import static jsTools.Graph.*;

class Lok {

    Wagon headW;

    private int posx, posy, lL, hL;

    // Konstruktor
    Lok(int x, int y, int l, int h) {
        this.posx = x;
        this.posy = y;
        this.lL = l;
        this.hL = h;
        headW = null;
    }

    // Wagen am Anfang einfügen
    void insertFirst(Wagon w) {
        if (headW == null) {
            headW = w;
            return;
        }
        w.next = headW;
        headW = w;
    }

    // Wagon am Ende hinzufügen
    void appWagon(Wagon w) {
        Wagon iterator = headW;
        if (headW == null) {
            headW = w;
            return;
        }
        while (iterator.hasNext()) {
            iterator = iterator.next;
        }
        iterator.next = w;
    }

    // Ersten Wagon entnehmen und zurückgeben
    Wagon returnFirst() {
        if (headW == null) {
            return null;
        }
        Wagon toReturn;
        toReturn = headW;
        headW = headW.next;
        return headW;
    }

    // Letzten Wagen entnehmen und zurückgeben
    Wagon returnLast() {
        if (headW == null) {
            return null;
        }
        Wagon iterator = headW;
        if (iterator.next == null) {
            headW = null;
            return iterator;
        }
        while (iterator.next.next != null) {
            iterator = iterator.next;
        }
        Wagon toReturn = iterator.next;
        iterator.next = null;
        return toReturn;
    }

    // Wagon an einer Position entnehmen und zurückgeben
    Wagon returnPos(int pos){
        Wagon toReturn;
        Wagon iterator = headW;
        if(headW == null){
            throw new IllegalArgumentException("Zug ist leer!");
        }
        while (iterator.getWagonNr() != pos){
            iterator = iterator.next;
        }
        toReturn = iterator;
        iterator.next = iterator;
        System.out.println(toReturn.toString());
        return toReturn;
    }

    // Wagon an einer Position einfügen
    void insertPos(Wagon w, int pos){
        Wagon iterator = headW;
        if(headW == null && pos != 0){
            throw new IllegalArgumentException("Zug ist leer! Position muss 0 sein");
        }
        else {
            //durchlaufen
            while(w.getWagonNr() > iterator.getWagonNr()){
                if(iterator.next == null){
                    iterator.next = w;
                    return;
                }
                if(w.getWagonNr() < iterator.getWagonNr()){
                    w.next = iterator;
                    iterator = w;
                    return;
                }
                iterator = iterator.next;
            }
        }
    }

    // paint first then paint all
    void paint() {
        addRect(posx, posy, lL, hL, "black"); // Lock
        if (headW != null) {
            headW.paint(posx + lL + 5, posy);
        }
    }
}
