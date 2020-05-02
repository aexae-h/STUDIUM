package ws20.aufgabe18_Geschaeftsprozess;

public class Main {

    final static int SIZEKREIS = 50;
    final static int SIZERECBREITE = 80;
    final static int SIZERECHOEHE = 50;
    final static int ABSTAND = 25;

    public static void main(String[] args) {

        // Objekte
        Start start = new Start("Hunger", 50, 50, SIZEKREIS);
        Sequenzfluss seqStartAufgabe = new Sequenzfluss(null);

        Aufgabe aufgabeAuswSpeise = new Aufgabe("Ausw\nSpeise", 150,50,SIZERECBREITE,SIZERECHOEHE);
        Sequenzfluss seqAufgabeGate = new Sequenzfluss(null);

        Gateway gateway1 = new Gateway("X",270,50,SIZERECBREITE);
        Sequenzfluss seqGateAufgabe1 = new Sequenzfluss("Pasta");
        Sequenzfluss seqGateAufgabe2 = new Sequenzfluss("Steak");

        Aufgabe aufgabePastaKochen = new Aufgabe("Pasta kochen",400,50,SIZERECBREITE,SIZERECHOEHE);
        Aufgabe aufgabeSteakBraten = new Aufgabe("Steak braten",400,150,SIZERECBREITE,SIZERECHOEHE);
        Sequenzfluss seqPastaGate = new Sequenzfluss(null);
        Sequenzfluss seqSteakGate = new Sequenzfluss(null);

        Gateway gateway2 = new Gateway("X",530,50,SIZERECBREITE);
        Sequenzfluss seqGateEssen = new Sequenzfluss(null);

        Aufgabe aufgabeEssen = new Aufgabe("Essen",680,50,SIZERECBREITE,SIZERECHOEHE);
        Sequenzfluss seqEssenEnde = new Sequenzfluss(null);

        Ende ende = new Ende("fertig",850,50,SIZEKREIS);

        // verknüpfen
        start.setNext(seqStartAufgabe);
        seqStartAufgabe.setNext(aufgabeAuswSpeise);

        aufgabeAuswSpeise.setNext(seqAufgabeGate);
        seqAufgabeGate.setNext(gateway1);

        gateway1.setNext(seqGateAufgabe1);
        gateway1.setNext(seqGateAufgabe2);
        seqGateAufgabe1.setNext(aufgabePastaKochen);
        seqGateAufgabe2.setNext(aufgabeSteakBraten);

        aufgabePastaKochen.setNext(seqPastaGate);
        aufgabeSteakBraten.setNext(seqSteakGate);
        seqPastaGate.setNext(gateway2);
        seqSteakGate.setNext(gateway2);

        gateway2.setNext(seqGateEssen);
        seqGateEssen.setNext(aufgabeEssen);

        aufgabeEssen.setNext(seqEssenEnde);
        seqEssenEnde.setNext(ende);

        // zeichnen
        start.add2Window();
    }
}