package ws19.aufgabe32_Klassen;

import java.util.Scanner;

class Personen {

    private static Scanner scan = new Scanner(System.in);
    static public int pnr;
    private String name;
    private int zip;
    private String ort;

    /** READ FULL */
    void read(){
        System.out.print("Personalnummer: ");   pnr = scan.nextInt();
        System.out.print("Name: ");             name = scan.next();
        System.out.print("PLZ: ");              zip = scan.nextInt();
        System.out.print("Ort: ");              ort = scan.next();
    }

    void print(){
        System.out.println("Personalnummer: " + pnr);
        System.out.println("Name: " + name);
        System.out.println("PLZ: " + zip);
        System.out.println("Ort: " + ort);
    }

    /**@param n prüfe ob dieser mit einer pnr übereinstimmt */
    boolean isNr(int n){
        return pnr == n;
    }
}
