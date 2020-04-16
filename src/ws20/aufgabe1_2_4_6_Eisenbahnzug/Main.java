package ws20.aufgabe1_2_4_6_Eisenbahnzug;

import static jsTools.Graph.*;

class Main {

    static void umkoppeln(Lok l1, Lok l2) {
        Wagon last = l1.returnLast();
        if (last == null) {
            return;
        }
        l2.appWagon(last);
        // movie stuff
        sleep(500);
        clearWindow();
        paintNew();
        l1.paint();
        l2.paint();
        //
        umkoppeln(l1, l2);
    }

    static void swap(Lok aLok, int posA, Lok bLok, int posB){
        Wagon one = aLok.returnPos(posA);
        Wagon two = bLok.returnPos(posB);
    }

    public static void main(String[] args) {

        final int HEIGHT = 20;
        final int LENGTH = 50;
        final int numWagon = 5;

        // Lok 1
        initWindow();
        Lok myLok = new Lok(40, 100, LENGTH, HEIGHT);
        for (int i = 0; i < numWagon; i++) {
            myLok.appWagon(new Wagon());
        }

        // Lok 2
        Lok myLok2 = new Lok(40, 200, LENGTH, HEIGHT);
        for (int i = 0; i < numWagon; i++) {
            myLok2.appWagon(new Wagon());
        }

        myLok.paint();
        myLok2.paint();
        swap(myLok, 3, myLok2, 7);
        initWindow();
        myLok.paint();
        myLok2.paint();
    }

}