package ws19.aufgabe41_Smiley;

import static jsTools.Graph.*;


class Main {

    static int a = 500;

    public static void main(String[] args) {

        addRect(0,0, 500, 500,"white");
        addCircleBorder(0,0, a,"yellow");           // großes Gesicht
        addCircleBorder((a-a/4)/2,(a-a/4)/2,a/4,"red");

        drawMouthRed((a-a/2)/2,a/2-a/10,a/2);
        drawMouthYellow((a-a/2)/2,a/2-a/10-a/10,a/2);
        drawLeftEye(a/9,a/9,a/3);
        drawRightEye(a-a/3-a/9,a/9,a/3);
        drawNose((a-a/4)/2,(a-a/4)/2,a/4);

    }

    private static void drawLeftEye (int y, int x, int s){
        addCircleBorder(y, x, s,"yellow");
        if (s<=10){
            return;
        }
        drawMouthRed(y+(s-s/2)/2,x+(s/2)-s/10,s/2);
        drawMouthYellow(y+(s-s/2)/2,x+(s/2)-s/10-s/10,s/2);
        drawNose(y+(s-s/4)/2, x+(s-s/4)/2,s/4);
        drawRightEye(y+s-s/3-s/9,x+s/9,s/3);
        drawLeftEye(y+s/9, x+s/9, s/3);
    }

    private static void drawRightEye (int y, int x, int s){
        addCircleBorder(y,x,s,"yellow");
        if (s<=10){
            return;
        }
        drawMouthRed(y+(s-s/2)/2,x+(s/2)-s/10,s/2);
        drawMouthYellow(y+(s-s/2)/2,x+(s/2)-s/10-s/10,s/2);
        drawNose(y+(s-s/4)/2, x+(s-s/4)/2,s/4);
        drawLeftEye(y+s/9, x+s/9, s/3);
        drawRightEye(y+s-s/3-s/9,x+s/9,s/3);
    }

    private static void drawNose (int y, int x, int s){
        addCircle(y,x,s,"red");
    }

    private static void drawMouthRed (int y, int x, int s){
        addCircle(y,x,s,"red"); //rot
    }

    private static void drawMouthYellow (int y, int x, int s){
        addCircle(y,x,s,"yellow"); //rot
    }
}