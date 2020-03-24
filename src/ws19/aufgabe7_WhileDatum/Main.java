package ws19.aufgabe7_WhileDatum;
import java.util.Scanner;

class Main {

    static int d;
    static int m;
    static int y;

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.println("Enter year");
            y = s.nextInt();
        } while (y > 2100 || y < 1900);

        do {
            System.out.println("Enter month");
            m = s.nextInt();
        } while (m < 0 || m > 12);

        if (m == 1 || m == 3 || m == 5  || m == 7 || m == 8 || m == 10 || m == 12) {
            do {
                System.out.println("Enter day");
                d = s.nextInt();
            } while (d < 0 || d > 31);
        }
        
        else if (m == 4 || m == 6 || m ==9 || m == 11) {
            do {
                System.out.println("Enter day");
                d = s.nextInt();
            } while (d < 0 || d > 30);
        }

        else if (m == 2) {
            do {
                System.out.println("Enter day");
                d = s.nextInt();
            } while (d < 0 || d > 28);
        }

        System.out.println(d + "." + m + "." + y);

    }
}
