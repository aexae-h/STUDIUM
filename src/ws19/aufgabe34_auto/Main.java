package ws19.aufgabe34_auto;
import java.util.Random;

import static jsTools.Graph.*;

class Main {

    static Random rn = new Random();
    static Auto a1 = new Auto();
    static int s= 50;

    public static void main(String[] args) {

        addRect(10,10,700,700,"white");

        a1.init("Audi", 50, 80, 80000, 2010,9,"red");
        a1.paint();

        while (true){
            int i = rn.nextInt((650-50)+1)+50;
            int j = rn.nextInt((650-50)+1)+50;
            sleep(500);
            a1.driveTo(i,j);
        }
    }
}