package ws20.corona;

import static jsTools.Graph.*;

import java.awt.*;
import java.util.Random;

public class Human {

    //-------------------------------------------------------

    static Random random = new Random();

    // declaring human as int (is set by jsTools)
    int human;
    // x-Position and y-Position of humans
    int pX, pY;
    // size of humans
    int size;
    // counter for healing : human will be healed after he moved <X> times
    int countForHeal;
    final int DAYS_TO_BE_HEALED = 1000;

    // color for comparsion
    Color white = new Color(255,255,255);
    Color black = new Color(0,0,0);
    Color red = new Color(255,0,0);
    Color blue = new Color(0,0,255);

    // inner grid size for "walls" so humans dont go out of the box
    final int INNER_GRID_SIZE_MAX = 640;
    final int INNER_GRID_SIZE_MIN = 10;

    // random direction
    static int[] mE = {-2, -1, 1, 2};
    int randomX = mE[random.nextInt(mE.length)];
    int randomY = mE[random.nextInt(mE.length)];

    //-------------------------------------------------------
    /**
     * constructor
     *
     * @param pX         : x-Position
     * @param pY         : y-Postion
     * @param size       : size of humans
     * @param identColor : setting color of human
     */
    Human(int pX, int pY, int size, String identColor) {
        this.pX = pX;
        this.pY = pY;
        this.size = size;
        // zeichne human
        human = addCircleBorder(pX, pY, size, identColor);
    }

    // set infected (set color = red) 
    void setInfected() {
        setColor(human, "red");
        paintNew();
    }

    // check if human is infected by comparing color
    boolean isInfected() {
        return getColor(human).equals(red);
    }

    // set healed (set color = blue)
    void setHealed() {
        setColor(human, "blue");
        paintNew();
    }

    // check if human is healed
    boolean isHealed() {
        return getColor(human).equals(blue);
    }

    // main move function
    void move() {
        if(isInfected()){
            countForHeal++;
            System.out.println(countForHeal);
        }
        if (countForHeal >= DAYS_TO_BE_HEALED){
            setHealed();
        }
        // check if human is out of grid : X-POSITION
        if (pX < INNER_GRID_SIZE_MIN || pX > INNER_GRID_SIZE_MAX) {
            // changing direction
            randomX *= -1;
        }
        // check if human is out of grid : Y-POSITION
        if (pY < INNER_GRID_SIZE_MIN || pY > INNER_GRID_SIZE_MAX) {
            // changing direction
            randomY *= -1;
        }
        // setting new positon with the random values from mE Array
        setPos(human, this.pX + randomX, this.pY + randomY);
        // sleep so its not so fast
        sleep(1);
        // paint the graph new so everything that was changed will be visible
        paintNew();
        // setting the x-Postion and y-Position new
        this.pX += randomX;
        this.pY += randomY;
    }

    @Override
    public String toString() {
        return "human{}";
    }
}
