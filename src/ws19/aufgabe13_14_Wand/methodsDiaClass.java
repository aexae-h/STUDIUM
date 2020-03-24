package ws19.aufgabe13_14_Wand;

import static jsTools.Wand.*;

class methodsDiaClass {

    static void paintDiaRtoL (int z0, int s0, int lge, String color) {

        for (int i = 0; i < lge; i++){
            setWandColor(z0+i,s0+i,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }

    static void paintDiaLtoR (int z0, int s0, int lge, String color) {

        for (int i = 0; i < lge; i++){
            setWandColor(z0+i,s0-i,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }
}
