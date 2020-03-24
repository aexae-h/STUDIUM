package ws19.aufgabe24_Ball;
import static jsTools.Graph.*;

class Main {

    public static void main(String[] args) {

        int px=10,    // x Position des Kreises
            kreis;    // Elementnummer des Kreises
        int py=500; // y-Position des Kreises

        addRect(10,10,680,680,"white");
        kreis=addCircleBorder(px,py,30,"blue");

        sleep(20); // 1000 Millisekunden warten = 1 sek
        px=px+2;
        moveElement(kreis, px, py);

        sleep(20);
        px=px+2;
        moveElement(kreis, px, py);

    }

    static void moveElement(int elNum, int toX, int toY){
        setPos(elNum,toX, toY);
        paintNew();
    }

}
