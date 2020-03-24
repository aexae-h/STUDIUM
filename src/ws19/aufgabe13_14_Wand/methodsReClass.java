package ws19.aufgabe13_14_Wand;

import static jsTools.Wand.*;
import static jsTools.Wand.sleep;

class methodsReClass {

    static void paintRe(int z0,
                        int s0,
                        int breite,
                        int hoehe) {
        //oben
        for (int i = s0; i<s0+breite; i++){
            setWandColor(z0,i,"green");
            paintWandNew();
            sleep(Main.speed);
        }
        //rechts
        for (int i = z0; i < z0+hoehe; i++){
            setWandColor(i,s0+breite-1, "red");
            paintWandNew();
            sleep(Main.speed);
        }
        //unten
        for (int i = s0+breite-1; i >= s0; i--){
            setWandColor(z0+hoehe-1,i, "yellow");
            paintWandNew();
            sleep(Main.speed);
        }
        //links
        for (int i = z0+hoehe-1; i >= z0; i--){
            setWandColor(i, s0, "blue");
            paintWandNew();
            sleep(Main.speed);
        }
    }
}
