package ws20.aufgabe18_Geschaeftsprozess;

import com.sun.nio.file.SensitivityWatchEventModifier;

public class Main {

    final static int SIZEKREIS = 50;
    final static int SIZERECBREITE = 80;
    final static int SIZERECHOEHE = 50;
    final static int ABSTAND = 25;

    public static void main(String[] args) {

        // Objekte
        Start start = new Start("start", 50, 50, SIZEKREIS);
        Sequenzfluss seqStartAufgabe = new Sequenzfluss(null);
        Aufgabe aufgabe = new Aufgabe("Auswahl Speise", 150,50,SIZERECBREITE,SIZERECHOEHE);


        // verknüpfen
        start.setNext(seqStartAufgabe);
        seqStartAufgabe.setNext(aufgabe);


        // zeichnen
        start.add2Window();
    }
}
