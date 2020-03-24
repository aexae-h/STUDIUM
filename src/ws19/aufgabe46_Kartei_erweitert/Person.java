package ws19.aufgabe46_Kartei_erweitert;

import java.util.Scanner;

class Person{
    // Scanner
    private Scanner sc = new Scanner(System.in);

    // Instanzvariablen
    private int pnr;
    private String name;
    private int zip;
    private String ort;

    // Zähler, bei jeder neuen Instanz -> ++
    private static int counter = 0;

    // Konstruktor der 3 Werte über Konsole einliest und PNR bekommt counter-Wert
    Person(){
        counter++;
        pnr = counter;
        try{
            System.out.print("Name eingeben: ");    name = sc.next();
            System.out.print("PLZ eingeben: ");     zip = sc.nextInt();
            System.out.print("Ort eingeben: ");     ort = sc.next();
        } catch (Exception e){
            System.out.println("*** Ungültige Eingabe ***");

        }
        System.out.println();
    }

    // Konstruktor mit PNR Übergabe
    Person(int p){
        pnr = p;
        try{
            System.out.print("Name eingeben: ");    name = sc.next();
            System.out.print("PLZ eingeben: ");     zip = sc.nextInt();
            System.out.print("Ort eingeben: ");     ort = sc.next();
        } catch (Exception e){
            System.out.println("*** Ungültige Eingabe ***");

        }
        System.out.println();
    }


    // Konstruktor mit 4 Paramtern, Eingebabe über param
    Person(int p, String n, int z, String o){
        counter++;
        pnr = p;
        name = n;
        zip = z;
        ort = o;
    }

    //getPnr
    public int getPnr(){
        return pnr;
    }

    //  Print Person, alle Attribute
    void printPerson(){
        System.out.print("PNR: " + pnr + "\t\t");
        System.out.print("Name: " + name + "\t\t");
        System.out.print("PLZ: " + zip + "\t\t");
        System.out.print("Ort: " + ort + "\t\t");
        System.out.println();
    }

    /* Einlesen der Attribute einer vorhandenen Instanz
     * der Person von der Konsole
     */
    void readPerson(){
        System.out.print("PNR eingeben: ");   pnr = sc.nextInt();
        System.out.print("Name eingeben: ");    name = sc.next();
        System.out.print("PLZ eingeben: ");     zip = sc.nextInt();
        System.out.print("Ort eingeben: ");     ort = sc.next();
    }

    /* Ueberpruefen, ob Personennummer der Instanz
     * gleich dem uebergebenen Parameter n ist
     */
    boolean isPnr( int n){
        return n == pnr;
    }
}
