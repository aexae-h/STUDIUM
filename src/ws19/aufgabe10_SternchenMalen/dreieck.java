package ws19.aufgabe10_SternchenMalen;

class dreieck {


    /** Höhe = INPUT */

    static void callDreieck(){

        int base = 2*Main.input-1;


        /** Erste Zeile */
        for (int i = 0; i < base-1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");


        /** Zeilen mit leerer Mitte */

        for (int i = 0; i < Main.input-2; i++) {

            /** LEERZEICHEN DAVOR + Sternchen*/
            System.out.print(" ".repeat(-2*i+((Main.input-2)*2)));
            System.out.print("*"); // erstes Sternchen in der Zeile

            /** LEERZEICHEN MITTE + Sternchen */
            System.out.print(" ".repeat(4*i+3));
            System.out.print("*"); // letztes Sternchen in der Zeile
            System.out.println(); // Zeilenumbruch
        }

        /** Letzte Zeile */
        for (int i = 0; i < base; i++) {
            System.out.print("* ");
        }

    }
}
