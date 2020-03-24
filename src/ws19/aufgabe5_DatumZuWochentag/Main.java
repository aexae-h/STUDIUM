package ws19.aufgabe5_DatumZuWochentag;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        int d;
        int m;
        int yc;
        int y = 0;
        int c = 0;
        int w;

        Scanner scan = new Scanner(System.in);

        System.out.println("Scheme: dd.mm.yyyy");
        System.out.println("Please enter day:");
        d = scan.nextInt();
        System.out.println("Please enter month:");
        m = scan.nextInt();
        System.out.println("Please enter year:");
        yc = scan.nextInt();

        //y und c berechnen
        if (yc < 2000 && yc >= 1900) {
            c = 19;
            y = yc - 1900;
        } else if (yc >= 2000 && yc <= 2100) {
            c = 20;
            y = yc - 2000;
        }

        //Monatszahlen richtig stellen
        if (m == 1 || m == 2) {
            m+=12;
            y--;
        }

        // Wochentag berechnen
        w = (d + (26*(m+1))/10  + (5*y)/4   + c/4 + 5*c -1)%7;

        switch (w) {
            case 0: System.out.println("Weekday: Sonntag");
                break;
            case 1: System.out.println("Weekday: Montag");
                break;
            case 2: System.out.println("Weekday: Dienstag");
                break;
            case 3: System.out.println("Weekday: Mittwoch");
                break;
            case 4: System.out.println("Weekday: Donnerstag");
                break;
            case 5: System.out.println("Weekday: Freitag");
                break;
            case 6: System.out.println("Weekday: Samstag");
                break;
        }
    }
}
