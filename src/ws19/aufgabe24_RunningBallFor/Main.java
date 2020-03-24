package ws19.aufgabe24_RunningBallFor;
import static jsTools.Graph.*;

class Main {

    public static void main(String[] args) {

        int px=10,    // x Position des Kreises
            kreis;    // Elementnummer des Kreises
        int py=500; // y-Position des Kreises

        int rectB = 680;
        int rectH = 680;

        addRect(10,10,rectB,rectH,"white");
        kreis=addCircleBorder(px,py,30,"blue");

        for (int i = 0; i < 499; i++) {
            sleep(2); // 1000 Millisekunden warten = 1 sek
            px=px+2;
            moveElement(kreis, px, py);
        }
    }

    private static void moveElement(int elNum, int toX, int toY){
        setPos(elNum,toX, toY);
        paintNew();
    }
}
