package ws19.aufgabe28_MyWall;
import java.util.Random;

import static jsTools.Wand.*;

class Main {

    static int s = 20; // sleep
    static String[] ranColor = {
            "blue",
            "red",
            "yellow",
            "orange",
            "green"
    };
    private static Random rn = new Random();


    public static void main(String[] args) {
        initWand(30);

        Obj[] obj = new Obj[100];
        for (int i = 0; i < 100; i++){
            obj[i] = new Obj();
            obj[i].drawSuare(0,getRanPos(),getRanColor());
            obj[i].fallDown();
            //obj[i].isThere = true;
            obj[i].checkLastRow();
        }


        Obj sq1 = new Obj();
        sq1.drawSuare(0,getRanPos(),getRanColor());

        sq1.fallDown();


        //resetWall();

    }

    static String getRanColor(){
        int ranNum = rn.nextInt(ranColor.length);
        return ranColor[ranNum];
    }

    static int getRanPos(){
        return rn.nextInt(24);
    }

    static void resetWall(){
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 24; j++){
                setWandColor(i, j, "black");
                paintWandNew();
                sleep(s);
            }
        }
    }









    /** ......
    private static void paintSth () {

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 24; j++){
                setWandColor(i, j, randColor());
                paintWandNew();
            }
        }
    }
     */
}
