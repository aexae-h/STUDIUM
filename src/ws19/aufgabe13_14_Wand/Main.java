package ws19.aufgabe13_14_Wand;
import java.util.Scanner;

import static jsTools.Wand.*;

class Main {

    static int speed = 30;

    public static void main(String[] args) {

        System.out.println("Enter number:");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        // initialisieren der Wand
        initWand();

        switch (input) {
            case 1:
                methodsBasicsClass.paintDiagonale("black");
                methodsBasicsClass.paintGegenDiagonale("red");
                methodsBasicsClass.paintHor(5,"blue");
                methodsBasicsClass.paintVer(8,"blue");;
                break;
            case 2:
                methodsVer2Hor2Class.paintHor2(3,10,5,"yellow");
                methodsVer2Hor2Class.paintVer2(3,10,5,"orange");
                break;
            case 3:
                methodsReClass.paintRe(2,2,10,10);
                break;
            case 4: // Kreuz zeichen
                methodsDiaClass.paintDiaRtoL(4,4,5,"black");
                methodsDiaClass.paintDiaLtoR(4,8,5,"red");
                break;
            case 5: // Raute Zeichen
                methodsDiaClass.paintDiaLtoR(4,8,5,"black");
                methodsDiaClass.paintDiaRtoL(4,8,5,"red");
                methodsDiaClass.paintDiaRtoL(8,4,5,"blue");
                methodsDiaClass.paintDiaLtoR(8,12,5,"green");
                break;
            case 6: // Methode Kreuz
                methodsKreuzClass.paintKreuz(4,4,6,"black");
                break;
            case 7:
                methodsRauteClass.paintRaute(6,6,6,"black");
        }
    }
}
