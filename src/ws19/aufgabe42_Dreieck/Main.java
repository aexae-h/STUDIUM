package ws19.aufgabe42_Dreieck;

import static jsTools.Graph.*;

class Main {

    static int a = 600;
    static int h = (int)((a * Math.pow(3,0.5))/2);

    public static void main(String[] args) {
        addRect(0,0,600,600,"white");
        drawSi(a/2,h,a,h);
    }

    public static void drawSi(int x, int y, int b, int h){
        if(b<=5){
            addTriangle(x,y,b,h,0,"black");
            return;
        }
        drawSi(x-b/4,y,b/2,h/2);      // Links
        drawSi(x,y-h/2,b/2,h/2);      // Oben
        drawSi(x+b/4,y,b/2,h/2);    // Rechts
    }
}
