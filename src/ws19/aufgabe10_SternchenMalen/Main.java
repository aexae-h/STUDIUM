package ws19.aufgabe10_SternchenMalen;
import java.util.Scanner;

class Main {

    private static Scanner scanner = new Scanner(System.in);
    static int input;


    public static void main(String[] args) {

        System.out.println("Größe der Formen angeben:");
        input = scanner.nextInt();

        System.out.println("Wähle: Quadrat (1) , Dreieck (2) , QuadratGedreht (3)");
        int auswahl = scanner.nextInt();

        switch (auswahl) {
            case 1: quadrat.callQuadrat();
            break;
            case 2: dreieck.callDreieck();
            break;
            case 3: gedrehtQ.callGedrehtQ();
            break;
            default: System.out.println("ungültig -> exit");
        }
    }
}
