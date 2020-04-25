package ws20.aufgabe18_Geschaeftsprozess;

abstract class _Size2p extends _Position {
    int sizeX, sizeY;

    public _Size2p(String txt, int xPos, int yPos, int sizeX, int sizeY) {
        super(txt, xPos, yPos);
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }
}
