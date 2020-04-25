package ws20.aufgabe18_Geschaeftsprozess;

import static jsTools.Graph.*;

public class Gateway extends _Size1p {
    Sequenzfluss[] next = new Sequenzfluss[3];

    public Gateway(String txt, int xPos, int yPos, int size) {
        super(txt, xPos, yPos, size);
    }

    void setNext(Sequenzfluss n){
        for(Sequenzfluss s : next){
            s = n;
        }
    }

    void add2Window(){
        addRectBorder(xPos,yPos,size,size,45,white,black);
    }

    // getX und getY in Vaterklasse "_Position"
}
