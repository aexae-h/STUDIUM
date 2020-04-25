package ws20.aufgabe18_Geschaeftsprozess;

abstract class _Position extends _Name {
    int xPos, yPos;

    _Position(String txt, int xPos, int yPos) {
        super(txt);
        this.xPos = xPos;
        this.yPos = yPos;
    }

    int getXZugangspunkt(){
        return xPos;
    }

    int getYZugangspunkt(){
        return yPos;
    }

    abstract void add2Window();
}
