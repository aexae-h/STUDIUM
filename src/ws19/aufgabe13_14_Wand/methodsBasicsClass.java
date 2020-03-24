package ws19.aufgabe13_14_Wand;

import static jsTools.Wand.*;
import static jsTools.Wand.sleep;

class methodsBasicsClass {

    static void paintDiagonale(String color) {
        for (int i = 0; i < 24; i++) {
            setWandColor(i,i,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }

    static void paintGegenDiagonale(String color) {
        for (int i = 0; i < 24; i++){
            setWandColor(i,23-i,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }

    static void paintHor(int zeile, String color) {
        for (int i = 0; i < 24; i++){
            setWandColor(zeile,i,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }

    static void paintVer(int zeile, String color) {
        for (int i = 0; i < 24; i++){
            setWandColor(i,zeile,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }
}
