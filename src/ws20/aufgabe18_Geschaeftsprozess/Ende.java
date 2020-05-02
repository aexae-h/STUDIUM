package ws20.aufgabe18_Geschaeftsprozess;

import static jsTools.Graph.*;

public class Ende extends _Size1p {

    public Ende(String txt, int xPos, int yPos, int size) {
        super(txt, xPos, yPos, size);
    }

    public void add2Window(){
        setLineWidth(5);
        addCircleBorder(xPos,yPos,size,white,black);
        addText(txt,xPos+size/4,yPos+size/2,10,black);
        setLineWidth(1);
    }

    // getX und getY in Vaterklasse "_Position"
}
