package ws19.aufgabe24_RunningBallWhile;
import java.util.Random;

import static jsTools.Graph.*;

class Main {

    static Random rn = new Random();

    private static int
            px = 50,            // x Position des Kreises
            kreis,              // Elementnummer des Kreises
            py = 500,           // y-Position des Kreises
            rectB = 680,        // Breite Rechteck
            rectH = 680,        // Höhe Rechteck
            s = 1;              // Sleep

    public static void main(String[] args) {

        addRect(10,10,rectB,rectH,"white");
        kreis=addCircleBorder(px,py,30,"blue");

        while (true) {
            int i = rn.nextInt((10-1)+1)+1;
            switch (i) {
                case 1:
                    moveRight();
                    break;
                case 2:
                    moveLeft();
                    break;
                case 3:
                    moveUp();
                    break;
                case 4:
                    moveDown();
                    break;
                case 5:
                    moveRightUp();
                    break;
                case 6:
                    moveRightDown();
                case 7:
                    moveLeftUp();
                    break;
                case 8:
                    moveLeftDown();
                    break;
            }
        }
    }

    private static void moveElement(int elNum, int toX, int toY){
        setPos(elNum,toX, toY);
        paintNew();
    }

    static void moveRight () {
        while (px < rectB-20) {
            sleep(s);
            px=px+2;
            moveElement(kreis, px, py);
        }
    }

    static void moveLeft () {
        while (px > 10) {
            sleep(s);
            px=px-2;
            moveElement(kreis, px, py);
        }
    }

    static void moveUp () {
        while (py > 10) {
            sleep(s);
            py=py-2;
            moveElement(kreis, px, py);
        }
    }

    static void moveDown () {
        while (py < rectH-20) {
            sleep(s);
            py=py+2;
            moveElement(kreis, px, py);
        }
    }

    static void moveRightUp () {
        while (px < rectH-20 && py > 10) {
            sleep(s);
            px+=2;
            py-=2;
            moveElement(kreis, px, py);
        }
    }

    static void moveLeftDown () {
        while (px > 10 && py < rectB-20) {
            sleep(s);
            px-=2;
            py+=2;
            moveElement(kreis, px, py);
        }
    }

    static void moveLeftUp () {
        while (px > 10 && py > 10) {
            sleep(s);
            px-=2;
            py-=2;
            moveElement(kreis, px, py);
        }
    }

    static void moveRightDown () {
        while (px < rectB-20 && py < rectH-20) {
            sleep(s);
            px+=2;
            py+=2;
            moveElement(kreis, px, py);
        }
    }
}
