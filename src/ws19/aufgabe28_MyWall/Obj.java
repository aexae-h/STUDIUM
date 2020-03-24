package ws19.aufgabe28_MyWall;
import static jsTools.Wand.*;

class Obj {

    int posx;
    int posy;
    String color;
    static int lastRow = 24;
    static boolean isThere = false;

    void drawSuare(int y, int x, String c) {

        setPosY(y);
        setPosX(x);
        setColor(c);
        setWandColor(y, x, c);
    }

    void setPosY(int i) {
        posy = i;
    }

    void setPosX(int i) {
        posx = i;
    }

    void setColor(String c) {
        color = c;
    }

    int getPosX() {
        return posx;
    }

    int getPosY() {
        return posy;
    }

    String getColor() {
        return color;
    }

    void fallDown() {
        for (int i = 1; i < lastRow; i++) {

            setWandColor(posy, posx, "white");
            posy++;
            setWandColor(posy, posx, getColor());
            sleep(Main.s);
            paintWandNew();

        }
    }

    void checkLastRow() {
        if (isThere) {
            lastRow--;
        }
    }
}
