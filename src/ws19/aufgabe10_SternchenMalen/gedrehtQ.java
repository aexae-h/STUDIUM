package ws19.aufgabe10_SternchenMalen;

class gedrehtQ {

    static void callGedrehtQ(){

        int base = 2*Main.input-1;

        /** OBERER TEIL */
        /** Erste Zeile */
        for (int i = 0; i < base-1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

        /** Zeilen mit leerer Mitte */
        for (int i = 0; i < Main.input-2; i++) {

            /** LEERZEICHEN DAVOR */
            System.out.print(" ".repeat(-2*i+((Main.input-2)*2)));
            System.out.print("*"); // erstes Sternchen in der Zeile

            /** LEERZEICHEN MITTE */
            System.out.print(" ".repeat(4*i+3));
            System.out.print("*"); // letztes Sternchen in der Zeile
            System.out.println();
        }

        /** UNTERER TEIL */
        /** Zeilen mit leerer Mitte */
        for (int i = Main.input-2; i >=0; i--) {

            /** LEERZEICHEN DAVOR */
            System.out.print(" ".repeat(-2*i+((Main.input-2)*2)));
            System.out.print("*"); // erstes Sternchen in der Zeile

            /** LEERZEICHEN MITTE */
            System.out.print(" ".repeat(4*i+3));
            System.out.print("*"); // letztes Sternchen in der Zeile
            System.out.println();
        }

        /** Letzte Zeile */
        for (int i = 0; i < base-1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

    }
}
