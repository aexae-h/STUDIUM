package ws19.aufgabe11_MultiTabelle;

import java.sql.SQLOutput;

class Main {

    public static void main(String[] args) {

        /**Beschriftung waagerecht*/
        System.out.println("_".repeat(85));
        System.out.print("\t | \t");
        for (int i = 1; i <= 10; i++){
            System.out.print(i + "\t\t");
        }

        System.out.println(); // Zeilenumbruch
        System.out.println("_".repeat(85));

        for (int i = 1; i <= 10; i++) {         // Zeilen durchlaufen

            System.out.print(i + "\t | \t");       // Beschriftung erste Spalte
            for (int j = 1; j <= 10; j++) {     // Spalten durchlaufen
                System.out.print(i*j + "\t\t"); // Berechnung
            }
            System.out.println();               // Zeilenumbruch
        }
        System.out.println("_".repeat(85));
    }
}
