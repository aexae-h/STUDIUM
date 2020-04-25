package ws20.aufgabe18_Geschaeftsprozess;

abstract class _Size1p extends _Position {
    int size;

    public _Size1p(String txt, int xPos, int yPos, int size) {
        super(txt, xPos, yPos);
        this.size = size;
    }
}
