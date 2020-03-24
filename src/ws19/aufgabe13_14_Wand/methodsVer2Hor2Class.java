package ws19.aufgabe13_14_Wand;

import static jsTools.Wand.*;
import static jsTools.Wand.sleep;

class methodsVer2Hor2Class {

    static void paintHor2(int zeile,
                          int from,
                          int lge,
                          String color) {
        for (int i = from; i < lge+from; i++){
            setWandColor(zeile,i,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }

    static void paintVer2(int spalte,
                          int from,
                          int lge,
                          String color) {
        for (int i = from; i < lge+from; i++){
            setWandColor(i,spalte,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }
}
