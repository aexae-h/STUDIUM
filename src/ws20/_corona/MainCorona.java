package ws20._corona;

import static jsTools.Graph.*;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Alexander
 * @version 1.0
 */

public class MainCorona {

    //-------------------------------------------------------

    static Random random = new Random();

    // Array for humans
    static Human[] humans;
    // ArrayList for adding Infected
    static ArrayList<Human> humansInfected = new ArrayList<>();

    // Size declration
    static final int GRID_SIZE = 650;
    static final int GRID_MARGIN = 10;
    static final int HUMAN_SIZE = 10;

    //-------------------------------------------------------

    // creating new humans
    static void newHumans(int count) {
        humans = new Human[count];
        for (int i = 0; i < humans.length; i++) {
            int pXrandom = 30 + random.nextInt(600);
            int pYrandom = 30 + random.nextInt(600);
            humans[i] = new Human(pXrandom, pYrandom, HUMAN_SIZE, "white");
        }
    }

    // check if two humans are nearby: a^2 + b^2 = c^2
    static boolean isNearby(Human m1, Human m2) {
        int i = (m1.pX - m2.pX) * (m1.pX - m2.pX) +
                (m1.pY - m2.pY) * (m1.pY - m2.pY);
        return Math.abs(i) < HUMAN_SIZE * HUMAN_SIZE;
    }

    // -------------------------------------------------------

    // main method
    public static void main(String[] args) {

        // new map
        addRect(GRID_MARGIN, GRID_MARGIN, GRID_SIZE, GRID_SIZE, "black");

        // create humans
        newHumans(40);

        // set first infected and adding to ArrayList
        humans[0].setInfected();
        humansInfected.add(humans[0]);

        // endless loop
        while (true) {
            // iterating normal Array
            for (int i = 0; i < humans.length; i++) {
                // letting humans move
                humans[i].move();
                // iterating ArrayList for comparsion
                for (int j = 0; j < humansInfected.size(); j++) {
                    // exclude humans who are in array and ArrayList
                    if (!humans[i].equals(humansInfected.get(j))) {
                        // check if a human is nearby a infected human and check wether an infected is not healed
                        if (isNearby(humans[i], humansInfected.get(j)) && !humansInfected.get(j).isHealed()) {
                            // set infected
                            humans[i].setInfected();
                            // dont add human again in ArrayList only once
                            if (!humansInfected.contains(humans[i])) {
                                humansInfected.add(humans[i]);
                            }
                        }
                    }
                }
            }
        }
    }
}

