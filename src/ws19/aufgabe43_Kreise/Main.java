package ws19.aufgabe43_Kreise;

import static jsTools.Graph.*;

class Main {

    static int a = 500;

    static int lvl = 1;
    static String color = "";

    public static void main(String[] args) {
        addRect(0,0, a, a,"grau");          // HG
        addCircle(0,0, a,"white");          // Großer weiser Kreis
        drawRightCircle(a/2,a/4,a/2); // rechter Kreis
        drawLeftCircle(0, a/4,a/2);   // linker Kreis
    }

    private static void drawLeftCircle (int x, int y, int s){
        if(s<=10){return;}
        sleep(100);
        addCircle(x,y,s,getColor(s));
        drawRightCircle(x+s/2,y+s/4,s/2);
        drawLeftCircle(x, y+s/4,s/2);
    }

    private static void drawRightCircle (int x, int y, int s){
        if(s<=10){return;}
        sleep(100);
        addCircle(x,y,s,getColor(s));
        drawRightCircle(x+s/2,y+s/4,s/2);
        drawLeftCircle(x, y+s/4,s/2);
    }

    private static String getColor(int s){
        if(s == a/2 || s == a/8 || s == a/32 || s == a/128){
            return "blue";
        }
        return "white";
    }
}
