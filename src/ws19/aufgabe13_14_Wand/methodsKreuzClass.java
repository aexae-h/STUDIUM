package ws19.aufgabe13_14_Wand;

import static jsTools.Wand.*;

public class methodsKreuzClass {

    static void paintKreuz (int z0, int s0, int lge, String color) {

        for (int i = 0; i < lge; i++){
            setWandColor(z0+i,s0+i,color);
            paintWandNew();
            sleep(Main.speed);
        }

        for (int i = 0; i < lge; i++){
            setWandColor(z0+i,s0+lge-1-i,color);
            paintWandNew();
            sleep(Main.speed);
        }
    }
}
