package ws20.aufgabe18_Geschaeftsprozess;

import static jsTools.Graph.*;

public class Aufgabe extends _Size2p {

    private Sequenzfluss next;

    public Aufgabe(String txt, int xPos, int yPos, int sizeX, int sizeY) {
        super(txt, xPos, yPos, sizeX, sizeY);
    }

    void setNext(Sequenzfluss n){
        this.next = n;
    }

    public void add2Window(){
        addRectBorder(xPos,yPos,sizeX,sizeY,white);
        addText(txt,xPos+sizeX/8,yPos+sizeY/2,10,black);
        next.add2Window(xPos+sizeX,yPos+sizeY/2);
    }

    // getX und getY in Vaterklasse "_Position"
}
