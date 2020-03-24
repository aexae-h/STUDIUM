package ws19.aufgabe18_Sterne;

import javax.imageio.ImageTranscoder;
import java.util.Scanner;

class Main {

    static int height;

    public static void main(String[] args) {
        runProg();
    }

    private static void runProg() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Nummer eingeben: 1 = Filled Forms, 2 = Corner Forms");
        int auswahl = scan.nextInt();

        System.out.println("Größe eingeben:");
        height = scan.nextInt();

        switch(auswahl) {
            case 1:
                methodsFilled.paintReFilled();
                methodsFilled.paintDrFilled();
                methodsFilled.paintRaFilled();
                break;
            case 2:
                methodsCorner.paintReCorner();
                methodsCorner.paintDrCorner();
                methodsCorner.paintRaCorner();
                break;
            default: runProg();
                break;
        }
    }
}
