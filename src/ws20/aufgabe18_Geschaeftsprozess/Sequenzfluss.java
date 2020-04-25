package ws20.aufgabe18_Geschaeftsprozess;

import static jsTools.Graph.*;

class Sequenzfluss extends _Name {

    _Position next;

    Sequenzfluss(String txt) {
        super(txt);
    }

    void setNext(_Position n){
        this.next = n;
    }

    void add2Window(int xA, int yA){

        addArrow(xA,yA,next.getXZugangspunkt(),next.getYZugangspunkt()+25,black);
        next.add2Window();
    }

}
