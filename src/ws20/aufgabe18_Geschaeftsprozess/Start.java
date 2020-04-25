package ws20.aufgabe18_Geschaeftsprozess;

import static jsTools.Graph.*;

public class Start extends _Size1p {
    Sequenzfluss next;

    public Start(String txt, int xPos, int yPos, int size) {
        super(txt, xPos, yPos, size);
    }

    void setNext(Sequenzfluss n){
        this.next = n;
    }

    void add2Window(){
        addCircleBorder(xPos,yPos,size,white,black);
        addText(txt,xPos+size/4,yPos+size/2,10,black);
        next.add2Window(xPos+size,yPos+size/2);
    }

    // getX und getY in Vaterklasse "_Position"
}
