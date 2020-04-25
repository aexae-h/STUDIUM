package ws20.aufgabe18_Geschaeftsprozess;

import static jsTools.Graph.*;

public class Ende extends _Size1p {

    public Ende(String txt, int xPos, int yPos, int size) {
        super(txt, xPos, yPos, size);
    }

    void add2Window(){
        setLineWidth(2);
        addCircleBorder(xPos,yPos,size,white,black);
    }

    // getX und getY in Vaterklasse "_Position"
}
