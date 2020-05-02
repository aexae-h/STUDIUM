package ws20.aufgabe18_Geschaeftsprozess;

import static jsTools.Graph.*;

public class Gateway extends _Size1p {
    private Sequenzfluss[] next = new Sequenzfluss[2];

    public Gateway(String txt, int xPos, int yPos, int size) {
        super(txt, xPos, yPos, size);
    }

    void setNext(Sequenzfluss n){
       for(int i = 0; i < next.length; i++){
           if(next[i] == null){
               next[i] = n;
               return;
           }
       }
    }

    void add2Window(){
        addRectBorder(xPos,yPos+size/2,size,size,45,white,black);
        addText("X",xPos+size/2,yPos+size/4*3,30,black);

        for(Sequenzfluss s : next){
            if(s != null){
                s.add2Window(xPos+size+size/4,yPos+size/2);
            }
        }

    }

    // getX und getY in Vaterklasse "_Position"
}
